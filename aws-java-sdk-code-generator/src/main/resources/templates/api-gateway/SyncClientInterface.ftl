${fileHeader}
<#assign serviceAbbreviation = (metadata.serviceAbbreviation)!metadata.serviceFullName/>
package ${metadata.packageName};

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import ${metadata.packageName}.model.*;

/**
 * Interface for accessing ${serviceAbbreviation}.
<#if metadata.documentation??>
 * <p>
 * ${metadata.documentation}
</#if>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ${metadata.syncInterface} {

  <#list operations?values as operationModel>
    <@InterfaceMethodForOperationMacro.content metadata operationModel />
  </#list>

    /**
    * @return Create new instance of builder with all defaults set.
    */
    public static ${metadata.syncClientBuilderClassName} builder() {
      return new ${metadata.syncClientBuilderClassName}();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

}
