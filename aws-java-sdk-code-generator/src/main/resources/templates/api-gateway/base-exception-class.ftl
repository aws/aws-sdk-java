${fileHeader}
package ${metadata.packageName}.model;

import com.amazonaws.opensdk.SdkErrorHttpMetadata;
import com.amazonaws.opensdk.internal.BaseException;
import com.amazonaws.annotation.SdkInternalApi;
import javax.annotation.Generated;

/**
 * Base exception for all service exceptions thrown by ${metadata.serviceFullName}
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${className} extends ${baseExceptionFqcn} implements BaseException {

    private static final long serialVersionUID = 1L;

    private SdkErrorHttpMetadata sdkHttpMetadata;

    private String message;

    /**
     * Constructs a new ${className} with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ${className}(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public ${className} sdkHttpMetadata(SdkErrorHttpMetadata sdkHttpMetadata) {
        this.sdkHttpMetadata = sdkHttpMetadata;
        return this;
    }

    @Override
    public SdkErrorHttpMetadata sdkHttpMetadata() {
        return sdkHttpMetadata;
    }

    @SdkInternalApi
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
