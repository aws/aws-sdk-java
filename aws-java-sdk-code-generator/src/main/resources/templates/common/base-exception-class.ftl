${fileHeader}
package ${metadata.packageName}.model;

/**
 * Base exception for all service exceptions thrown by ${metadata.serviceFullName}
 */
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
