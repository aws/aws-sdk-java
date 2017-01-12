${fileHeader}
package ${metadata.packageName}.model;

import javax.annotation.Generated;

/**
 * Base exception for all service exceptions thrown by ${metadata.serviceFullName}
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${className} extends ${baseExceptionFqcn} {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ${className} with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ${className}(String message) {
        super(message);
    }

}
