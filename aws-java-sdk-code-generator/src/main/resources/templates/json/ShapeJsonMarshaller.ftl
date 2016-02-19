<#assign shape = shapes[shapeName]/>
<#if shape.type = "Request">
<@RequestMarshallerMacro.content .data_model/>
<#else>
<@ModelMarshallerMacro.content .data_model/>
</#if>