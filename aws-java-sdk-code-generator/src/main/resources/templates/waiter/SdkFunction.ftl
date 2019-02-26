${fileHeader}
<#assign inputType = operation.input.variableType>
<#assign outputType = operation.returnType.returnType>
<#assign input = operation.input.variableName>
<#assign operationName = operation.operationName>

package ${metadata.packageName}.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.SdkFunction;
import ${metadata.packageName}.model.${inputType};
import ${metadata.packageName}.model.${outputType};
import ${metadata.packageName}.${metadata.syncInterface};

@SdkInternalApi
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${operationName}Function implements SdkFunction<${inputType}, ${outputType}>{

    /**
     * Represents the service client
     */
    private final ${metadata.syncInterface} client;

    /**
      * Constructs a new ${operationName}Function with the
      * given client
      * @param client
      *         Service client
      */
    public ${operationName}Function(${metadata.syncInterface} client){
        this.client = client;
    }

    /**
      * Makes a call to the operation specified by the
      * waiter by taking the corresponding request and
      * returns the corresponding result
      * @param ${input}
      *          Corresponding request for the operation
      * @return Corresponding result of the operation
      */
    @Override
    public ${outputType} apply(${inputType} ${input}){
        return client.${waiter.operationMethodName}(${input});
    }
}
