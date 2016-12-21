${fileHeader}
package ${metadata.packageName}.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;
<#if shape.requestSignerAware>
import com.amazonaws.auth.RequestSigner;
import com.amazonaws.opensdk.protect.auth.RequestSignerAware;
</#if>

/**
 * <#if shape.documentation?has_content>${shape.documentation}</#if>
 */
public class ${shape.shapeName} extends ${baseClassFqcn} implements Serializable, Cloneable
        <#if shape.requestSignerAware>, RequestSignerAware</#if>{

    <@VariableDeclarationMacro.content shape/>

    <#if shape.additionalConstructors?has_content>
        <@ConstructorDefinitionMacro.content shape/>
    </#if>

    <@MethodDefinitionMacro.content customConfig shape shape.shapeName/>

    <#-- Injection point for adding custom code to request classes -->
    <#if CustomRequestClassMethodsMacro?has_content>
        <@CustomRequestClassMethodsMacro.content shape/>
    </#if>

    <@OverrideMethodsMacro.content shape />

    @Override
    public ${shape.shapeName} clone() {
        return (${shape.shapeName}) super.clone();
    }

    <#if shape.requestSignerAware>
    @Override
    public Class<? extends RequestSigner> signerType() {
        return ${shape.requestSignerClassFqcn}.class;
    }
    </#if>

    <#if shouldGenerateSdkRequestConfigSetter>
    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig Request configuration.
     * @return This object for method chaining.
     */
    public ${shape.shapeName} sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }
    </#if>

}
