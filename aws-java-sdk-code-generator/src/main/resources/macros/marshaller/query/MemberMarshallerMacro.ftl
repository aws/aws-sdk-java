<#macro content customConfig shapeName getterFunctionPrefix, shapes, contextPath>
<#local shape = shapes[shapeName]/>

<#if shape.members??>
<#list shape.members as member>
<#local getMember = getterFunctionPrefix + "." + member.getterMethodName />
<#local http = member.http />
<#local variable = member.variable />

<#if member.simple>
    <#local parameterPath = http.marshallLocationName/>
    <#if contextPath?has_content>
        <#local parameterPath = contextPath + "." + parameterPath/>
    </#if>
    <#if member.idempotencyToken>
        request.addParameter("${parameterPath}", <@IdempotencyTokenMacro.content getMember member.variable.simpleType/>);
    <#else>
        if(${getMember}() != null) {
            request.addParameter("${parameterPath}", StringUtils.from${variable.simpleType}(${getMember}()));
        }
    </#if>
<#elseif member.list>
    <#local listModel = member.listModel />
    <#local memberVariableName = member.name?uncap_first/>
    <#local listIndex = memberVariableName  + "ListIndex"/>
    <#local listVariable = memberVariableName + "List"/>
    <#local loopVariable = listVariable + "Value"/>

    <#if http.flattened>
        <#if listModel.memberLocationName?has_content>
            <#local parameterPath = listModel.memberLocationName/>
        <#else>
            <#local parameterPath = http.marshallLocationName/>
        </#if>
        <#local parameterPath = contextPath?has_content?string(contextPath+"."+parameterPath,parameterPath)/>

        <#-- The variable parameterRootPath is the root marshall location for the list. It is used as the query key when the list
             is empty and an empty string is to be sent to the wire.
         -->
        <#local parameterRootPath = parameterPath>
    <#else>
        <#local parameterPath = http.marshallLocationName/>
        <#if contextPath?has_content>
            <#local parameterPath = contextPath + "." + parameterPath/>
        </#if>

        <#-- The variable parameterRootPath is the root marshall location for the list. It is used as the query key when the list
             is empty and an empty string is to be sent to the wire.
         -->
        <#local parameterRootPath = parameterPath>

        <#if listModel.memberLocationName?has_content>
            <#local parameterPath = parameterPath + "." + listModel.memberLocationName/>
        <#else>
            <#local parameterPath = parameterPath + ".member"/>
        </#if>
    </#if>

    <#if customConfig.useAutoConstructList>
        <#if listModel.sendEmptyQueryString>
            if (${getMember}().isEmpty()) {
                request.addParameter("${parameterRootPath}", "");
            }
        </#if>
        <#if listModel.marshallNonAutoConstructedEmptyLists>
            if (${getMember}().isEmpty() && !((${listModel.templateImplType})${getMember}()).isAutoConstruct()) {
                request.addParameter("${parameterRootPath}", "");
            }
        </#if>
        if (!${getMember}().isEmpty() || !((${listModel.templateImplType})${getMember}()).isAutoConstruct()) {
            ${listModel.templateImplType} ${listVariable} = (${listModel.templateImplType})${getMember}();
    <#else>

        if (${getMember}() != null) {
            ${listModel.templateType} ${listVariable} = ${getMember}();
            <#-- For query protocol, an empty list is serialized differently. -->
            if (${listVariable}.isEmpty()) {
                request.addParameter("${parameterRootPath}", "");
            } else {
    </#if>
                int ${listIndex} = 1;

                for (${listModel.memberType} ${loopVariable} : ${listVariable}) {
                    <#if listModel.simple>
                    if (${loopVariable} != null) {
                        request.addParameter("${parameterPath}." + ${listIndex}, StringUtils.from${listModel.simpleType}(${loopVariable}));
                    }
                    <#else>
                    <@MemberMarshallerMacro.content customConfig listModel.memberType loopVariable shapes parameterPath + ".\" + " + listIndex + " + \""/>
                    </#if>
                    ${listIndex}++;
                }
    <#if !customConfig.useAutoConstructList>
            }
    </#if>
        }
<#elseif member.map>
    <#local parameterPath = http.marshallLocationName/>
    <#local mapModel = member.mapModel />

    <#if contextPath?has_content>
        <#local parameterPath = contextPath + "." + parameterPath/>
    </#if>

    <#if !http.flattened>
        <#local parameterPath = parameterPath + ".entry"/>
    </#if>

    <#local listIndex = variable.variableName  + "ListIndex"/>

    ${mapModel.templateType} ${variable.variableName} = ${getMember}();
    <#if !customConfig.useAutoConstructMap>
        if (${variable.variableName} != null) {
    </#if>
            int ${listIndex} = 1;
            for (Map.Entry<${mapModel.keyType},${mapModel.valueType}> entry : ${variable.variableName}.entrySet()) {
                if (entry.getKey() != null) {
                    request.addParameter("${parameterPath}." + ${listIndex} + ".${mapModel.keyLocationName}", StringUtils.from${mapModel.keyType}(entry.getKey()));
                }
                <#if mapModel.valueSimple>
                if (entry.getValue() != null) {
                    request.addParameter("${parameterPath}." + ${listIndex} + ".${mapModel.valueLocationName}", StringUtils.from${mapModel.valueModel.variable.simpleType}(entry.getValue()));
                }
                <#else>
                if (entry.getValue() != null) {
                    <#local path = parameterPath + ".\" + " + listIndex + " + \"" + ".${mapModel.valueLocationName}"/>
                    <@MemberMarshallerMacro.content customConfig mapModel.valueType "entry.getValue()" shapes path/>
                }
                </#if>
                ${listIndex} ++;
            }
    <#if !customConfig.useAutoConstructMap>
        }
    </#if>

<#else>
    <#local parameterPath = http.marshallLocationName/>
    <#if contextPath?has_content>
        <#local parameterPath = contextPath + "." + parameterPath/>
    </#if>
    <#local memberVariableName = variable.variableName/>
    {
        ${variable.variableType} ${memberVariableName} = ${getMember}();
        if (${memberVariableName} != null) {
            <@MemberMarshallerMacro.content customConfig variable.variableType memberVariableName shapes parameterPath/>
        }
    }
</#if>
</#list>
</#if>
</#macro>
