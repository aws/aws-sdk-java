${fileHeader}
package ${metadata.packageName};

import ${metadata.packageName}.model.*;
import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;

/**
 * Abstract implementation of {@code ${metadata.syncInterface}}.
 */
public class ${metadata.syncAbstractClass} implements ${metadata.syncInterface} {

    protected ${metadata.syncAbstractClass}() {
    }

  <#list operations?values as operationModel>
    <@ClientMethodForUnsupportedOperation.content operationModel />
  </#list>

    @Override
    public RawResult execute(RawRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RawResult execute(RawRequest request, ResultContentConsumer consumer) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

}
