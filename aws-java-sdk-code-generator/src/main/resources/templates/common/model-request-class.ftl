${fileHeader}
package ${metadata.packageName}.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
<#if shape.requestSignerAware>
import com.amazonaws.auth.RequestSigner;
import com.amazonaws.opensdk.protect.auth.RequestSignerAware;
<#elseif shape.signerAware>
import com.amazonaws.auth.SignerTypeAware;
</#if>

<#if shape.documentation?has_content || awsDocsUrl?has_content>
/**
<#if shape.documentation?has_content> * ${shape.documentation}</#if>
<#if awsDocsUrl?has_content> * ${awsDocsUrl}</#if>
 */
</#if>
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${shape.shapeName} extends ${baseClassFqcn} implements Serializable, Cloneable
        <#if shape.requestSignerAware>, RequestSignerAware<#elseif shape.signerAware>, SignerTypeAware</#if> {

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

    <#if shape.signerAware>
    @Override
    public String getSignerType() {
        return "${shape.signerType}";
    }
    </#if>

}
