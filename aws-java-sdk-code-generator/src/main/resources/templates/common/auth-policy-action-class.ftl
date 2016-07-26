${fileHeader}
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

<#assign serviceAbbreviation = (metadata.serviceAbbreviation)!metadata.serviceFullName/>

/**
 * The available AWS access control policy actions for ${serviceAbbreviation}.
 */

 public enum ${serviceName}Actions implements Action {

    /** Represents any action executed on ${serviceAbbreviation}. */
    All${serviceName}Actions("${actionPrefix}:*"),

    <#list operations as operation>
        /** Action for the ${operation} operation. */
        ${operation}("${actionPrefix}:${operation}"),
    </#list>

    ;

    private final String action;

    private ${serviceName}Actions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
 }
