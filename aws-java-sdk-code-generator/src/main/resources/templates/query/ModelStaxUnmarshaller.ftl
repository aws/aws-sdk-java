${fileHeader}
package ${transformPackage};

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import ${metadata.packageName}.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * ${shape.shapeName} StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${shape.shapeName}StaxUnmarshaller implements Unmarshaller<${shape.shapeName}, StaxUnmarshallerContext> {

<#if shape.members?has_content>
<#list shape.members as memberModel>
    <#if memberModel.map>
        <@MapEntryUnmarshallerMacro.content memberModel />
    </#if>
</#list>
</#if>

    public ${shape.shapeName} unmarshall(StaxUnmarshallerContext context) throws Exception {
        ${shape.shapeName} ${shape.variable.variableName} = new ${shape.shapeName}();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

<#if shape.hasPayloadMember>
    <#-- Do not adjust stax context if we need to read raw payload data -->
<#elseif shape.wrapper>
    <#-- For query (elasticache, rds, redshift) protocol, if the return type of certain operation is wrapped, -->
    <#-- it'll have a result wrapper. In the below operaion, the return type is CacheCluster other than CreateCacheClusterResult. -->
    <#-- http://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheCluster.html -->
        if (context.isStartOfDocument()) targetDepth += 3;
<#elseif !shape.unmarshaller.resultWrapper?has_content>
    <#-- For rest-xml (s3, route53, cloudfront) and ec2 protocol, the response data are wrapped by one layer of ???Response tag -->
        if (context.isStartOfDocument()) targetDepth += 1;
<#else>
    <#-- With resultWrapper, the response data is wrapped by two layers: -->
    <#-- http://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html -->
        if (context.isStartOfDocument()) targetDepth += 2;
</#if>

<#if shape.hasHeaderMember >
        if (context.isStartOfDocument()) {
    <#list shape.members as memberModel>
        <#if memberModel.http.isHeader() >
            context.setCurrentHeader("${memberModel.http.unmarshallLocationName}");
            ${shape.variable.variableName}.${memberModel.setterMethodName}(
            <#if memberModel.variable.simpleType == "Date">
                DateStaxUnmarshallerFactory.getInstance("${memberModel.variable.timestampFormat}").unmarshall(context));
            <#else>
                ${memberModel.variable.simpleType}StaxUnmarshaller.getInstance().unmarshall(context));
            </#if>

        </#if>
    </#list>
        }
</#if>

<#if shape.hasStatusCodeMember >
    <#list shape.members as memberModel>
        <#if memberModel.http.isStatusCode() >
        ${shape.variable.variableName}.${memberModel.setterMethodName}(context.getHttpResponse().getStatusCode());
        </#if>
    </#list>
</#if>

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return ${shape.variable.variableName};

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

<#if shape.members?has_content>
  <#if shape.customization.artificialResultWrapper?has_content>
    <#assign artificialWrapper = shape.customization.artificialResultWrapper />
    <#-- If it's a result wrapper created by the customization, then we skip xpath test and directly invoke the unmarshaller for the wrapped member -->
                ${shape.variable.variableName}.set${artificialWrapper.wrappedMemberName}(
                    ${artificialWrapper.wrappedMemberSimpleType}StaxUnmarshaller.getInstance().unmarshall(context)
                    );
                continue;
  <#else>
    <#list shape.members as memberModel>
        <#if !memberModel.http.isHeader() && !memberModel.http.isStatusCode() >
            <@MemberUnmarshallerInvocationMacro.content shape.variable.variableName memberModel />
        </#if>
    </#list>
  </#if>
</#if>
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ${shape.variable.variableName};
                }
            }
        }
    }

    private static ${shape.shapeName}StaxUnmarshaller instance;
    public static ${shape.shapeName}StaxUnmarshaller getInstance() {
        if (instance == null) instance = new ${shape.shapeName}StaxUnmarshaller();
        return instance;
    }
}
