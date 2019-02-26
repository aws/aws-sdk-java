${fileHeader}
<#assign outputType = operation.returnType.returnType>

package ${metadata.packageName}.waiters;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.WaiterAcceptor;
import com.amazonaws.waiters.WaiterState;
import com.amazonaws.waiters.AcceptorPathMatcher;
import ${metadata.packageName}.model.*;

import com.fasterxml.jackson.databind.JsonNode;

import com.amazonaws.jmespath.*;

import java.io.IOException;
import javax.annotation.Generated;

@SdkInternalApi
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class ${waiter.waiterName} {

<#list waiter.acceptors as acceptor>

    <#if !acceptor.isStatusMatcher>
    static class Is${acceptor.expectedAsCamelCase}Matcher extends WaiterAcceptor<${outputType}> {
        <#if acceptor.isErrorMatcher>
            /**
              * Takes the response exception and determines whether this
              * exception matches the expected exception, by comparing the
              * respective error codes.
              * @param e
              *          Response Exception
              * @return True if it matches, False otherwise
              */
            @Override
            public boolean matches(AmazonServiceException e){
                return ${acceptor.expectedAsString}.equals(e.getErrorCode());
            }
        <#else>
            private static final JsonNode expectedResult;

            static{
                 try{
                      expectedResult = ObjectMapperSingleton.getObjectMapper().readTree("${acceptor.expectedAsEscapedJson}");
                 }
                 catch(IOException ioe){
                      throw new RuntimeException(ioe);
                 }
            }

            private static final JmesPathExpression ast = ${acceptor.ast};

            /**
              * Takes the result and determines whether the state of the
              * resource matches the expected state. To determine the current
              * state of the resource, JmesPath expression is evaluated and
              * compared against the expected result.
              * @param result
              *          Corresponding result of the operation
              * @return True if current state of the resource matches the
              *         expected state, False otherwise
              */
            @Override
            public boolean matches(${outputType} result) {
                JsonNode queryNode = ObjectMapperSingleton.getObjectMapper().valueToTree(result);
                JsonNode finalResult = ast.accept(new JmesPathEvaluationVisitor(), queryNode);
                return AcceptorPathMatcher.${acceptor.matcher}(expectedResult, finalResult);
            }
        </#if>

        /**
          * Represents the current waiter state in the case
          * where resource state matches the expected state
          * @return Corresponding state of the waiter
          */
        @Override
        public WaiterState getState(){
            return ${acceptor.enumState};
        }
    }
    </#if>
</#list>
}
