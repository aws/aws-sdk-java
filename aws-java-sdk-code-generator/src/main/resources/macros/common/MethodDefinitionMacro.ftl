<#macro content customConfig shape shapeName>
<#if shape.members?has_content>
<#list  shape.members as member>
<#local memberName = member.name />
<#local setterMethodName = member.setterMethodName />
<#local getterMethodName = member.getterMethodName />
<#local fluentSetterMethodName = member.fluentSetterMethodName />
<#local variableName = member.variable.variableName />
<#local variableType = member.variable.variableType />
<#local getter = member.getterModel/>
<#local setter = member.setterModel/>
<#local setterDoc = member.setterDocumentation!""/>
<#local getterDoc = member.getterDocumentation!""/>
<#local fluentDoc = member.fluentSetterDocumentation!""/>

<#if member.deprecated || (member.shape?? && member.shape.deprecated)>
<#local deprecated = "@Deprecated"/>
<#else>
<#local deprecated = ""/>
</#if>

<#if member.list>
    <#local listModel = member.listModel/>

    ${getterDoc}
    ${deprecated}
    <@AdditionalAnnotationsForAccessors.content shape.type member/>
    public ${getter.returnType} ${getterMethodName}() {
        <#if customConfig.useAutoConstructList>
        if(${variableName} == null) {
            ${variableName} = new ${listModel.templateImplType}();
        }
        </#if>
        return ${variableName};
    }

    ${setterDoc}
    ${deprecated}
    <@AdditionalAnnotationsForAccessors.content shape.type member/>
    public void ${setterMethodName}(${setter.variableSetterType} ${setter.variableName}){
        if (${setter.variableName} == null) {
            this.${variableName} = null;
            return;
        }

        this.${variableName} =
            new ${listModel.templateImplType}(${setter.variableName});
    }

    ${member.varargSetterDocumentation}
    ${deprecated}
    public ${shapeName} ${fluentSetterMethodName}(${listModel.memberType}... ${setter.variableName}){
        if (this.${variableName} == null) {
            ${setterMethodName}(new ${listModel.templateImplType}(${setter.variableName}.length));
        }
        for (${listModel.memberType} ele : ${setter.variableName}) {
            this.${variableName}.add(ele);
        }
        return this;
    }

    ${fluentDoc}
    ${deprecated}
    public ${shapeName} ${fluentSetterMethodName}(${setter.variableSetterType} ${setter.variableName}){
        ${setterMethodName}(${setter.variableName});
        return this;
    }


    <#if member.enumType?has_content>
    ${fluentDoc}
    ${deprecated}
    public ${shapeName} ${fluentSetterMethodName}(${member.enumType}... ${setter.variableName}) {
        ${listModel.templateImplType} ${setter.variableName}Copy = new ${listModel.templateImplType}(${setter.variableName}.length);
        for (${member.enumType} value : ${setter.variableName}) {
            ${setter.variableName}Copy.add(value.toString());
        }
        if (${getterMethodName}() == null) {
            ${setterMethodName}(${setter.variableName}Copy);
        } else {
            ${getterMethodName}().addAll(${setter.variableName}Copy);
        }
        return this;
    }
    </#if>

<#elseif member.map>
    <#local mapModel = member.mapModel/>
    <#local mapKeyType = mapModel.keyType/>
    <#local mapValueType = mapModel.valueType/>
    <#local keyVariableName = "key">
    <#local valueVariableName = "value"/>

    ${getterDoc}
    ${deprecated}
    <@AdditionalAnnotationsForAccessors.content shape.type member/>
    public ${getter.returnType} ${getterMethodName}(){
        <#if customConfig.useAutoConstructMap>
        if(${variableName} == null) {
            ${variableName} = new ${mapModel.templateImplType}();
        }
        </#if>
        return ${variableName};
    }

    ${setterDoc}
    ${deprecated}
    <@AdditionalAnnotationsForAccessors.content shape.type member/>
    public void ${setterMethodName}(${setter.variableType} ${setter.variableName}){
        <#if customConfig.useAutoConstructMap>
            this.${variableName} = ${setter.variableName} == null
                ? null
                : new ${mapModel.templateImplType}(${setter.variableName});
        <#else>
            this.${variableName} = ${setter.variableName};
        </#if>
    }

    ${fluentDoc}
    ${deprecated}
    public ${shapeName} ${fluentSetterMethodName}(${setter.variableType} ${setter.variableName}){
        ${setterMethodName}(${setter.variableName});
        return this;
    }

    ${deprecated}
    public ${shapeName} add${member.name}Entry(${mapKeyType} ${keyVariableName}, ${mapValueType} ${valueVariableName}) {
        if (null == this.${variableName}) {
            this.${variableName} = new ${mapModel.templateImplType}();
        }
        if (this.${variableName}.containsKey(${keyVariableName}))
            throw new IllegalArgumentException("Duplicated keys (" + ${keyVariableName}.toString() + ") are provided.");
        this.${variableName}.put(${keyVariableName}, ${valueVariableName});
        return this;
    }

    /**
      * Removes all the entries added into ${member.name}.
      *
      * @return Returns a reference to this object so that method calls can be chained together.
      */
    ${deprecated}
    public ${shapeName} clear${member.name}Entries() {
        this.${variableName} = null;
        return this;
    }

<#else>

    ${setterDoc}
    ${deprecated}
    <@AdditionalAnnotationsForAccessors.content shape.type member/>
    public void ${setterMethodName}(${setter.variableType} ${setter.variableName}) {
        this.${variableName} = ${setter.variableName};
    }

    <#-- Do not add Jackson annotations to enum getters and setters. This can break customers.
         See commit bda4dd89 in codegen package -->
    ${getterDoc}
    ${deprecated}
    <@AdditionalAnnotationsForAccessors.content shape.type member/>
    public ${getter.returnType} ${getterMethodName}() {
        return this.${variableName};
    }

    ${fluentDoc}
    ${deprecated}
    public ${shapeName} ${fluentSetterMethodName}(${setter.variableType} ${setter.variableName}) {
        ${setterMethodName}(${setter.variableName});
        return this;
    }

    <#list customConfig.convenienceTypeOverloads as convenienceTypeOverload>
        <#if convenienceTypeOverload.accepts(shape, member)>
            ${deprecated}
            ${setterDoc}
            public void ${setterMethodName}(${convenienceTypeOverload.convenienceType} ${setter.variableName}) {
                ${setterMethodName}(new ${convenienceTypeOverload.typeAdapterFqcn}().adapt(${setter.variableName}));
            }

            ${deprecated}
            ${fluentDoc}
            public ${shapeName} ${fluentSetterMethodName}(${convenienceTypeOverload.convenienceType} ${setter.variableName}) {
                ${setterMethodName}(new ${convenienceTypeOverload.typeAdapterFqcn}().adapt(${setter.variableName}));
                return this;
            }
        </#if>
    </#list>

     <#-- Do not add Jackson annotations to enum getters and setters. This can break customers.
          See commit bda4dd89 in codegen package -->
    <#if member.enumType?has_content && member.shouldEmitLegacyEnumSetter>
    ${setterDoc}
    ${deprecated}
    public void ${setterMethodName}(${member.enumType} ${setter.variableName}) {
        ${fluentSetterMethodName}(${setter.variableName});
    }
    </#if>

    <#if member.enumType?has_content>
    ${fluentDoc}
    ${deprecated}
    public ${shapeName} ${fluentSetterMethodName}(${member.enumType} ${setter.variableName}) {
        this.${variableName} = ${setter.variableName}.toString();
        return this;
    }
    </#if>

    <#if variableType == "Boolean">
    ${getterDoc}
    ${deprecated}
    <#local functionName = "is${memberName}" />
    <#if memberName?starts_with("is") || memberName?starts_with("Is")>
      <#-- Replaces first occurrence of String "is" with empty string. Ignores case and replaces only first occurrence. -->
      <#-- For more information, see http://freemarker.org/docs/ref_builtins_string.html#ref_builtin_string_flags -->
      <#local functionName = "is" + memberName?replace("is","","fi")/>
    </#if>
    public ${getter.returnType} ${functionName}() {
        return this.${variableName};
    }
    </#if>

</#if>
</#list>
</#if>
</#macro>
