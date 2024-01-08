package softeer.tenten.service.S3;

import com.amazonaws.services.s3.AmazonS3Client;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AwsS3Service {

    private final AmazonS3Client amazonS3Client;
    @Value("${cloud.aws.s3.bucket}")
    private String bucketName;
    public String getPath(String fileName) {
        return amazonS3Client.getUrl(bucketName, fileName).toString();
    }
}
