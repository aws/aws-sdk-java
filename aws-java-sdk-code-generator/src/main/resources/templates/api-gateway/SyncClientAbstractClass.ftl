${fileHeader}
package ${metadata.packageName};

import javax.annotation.Generated;
import ${metadata.packageName}.model.*;
import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;

/**
 * Abstract implementation of {@code ${metadata.syncInterface}}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${metadata.syncAbstractClass} implements ${metadata.syncInterface} {

    protected ${metadata.syncAbstractClass}() {
    }

  <#list operations?values as operationModel>
    <@ClientMethodForUnsupportedOperation.content operationModel />
  </#list>

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

}
