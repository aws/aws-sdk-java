/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

/**
 * Deployment Command Name
 */
public enum DeploymentCommandName {
    
    Install_dependencies("install_dependencies"),
    Update_dependencies("update_dependencies"),
    Update_custom_cookbooks("update_custom_cookbooks"),
    Execute_recipes("execute_recipes"),
    Deploy("deploy"),
    Rollback("rollback"),
    Start("start"),
    Stop("stop"),
    Restart("restart"),
    Undeploy("undeploy");

    private String value;

    private DeploymentCommandName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return DeploymentCommandName corresponding to the value
     */
    public static DeploymentCommandName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("install_dependencies".equals(value)) {
            return DeploymentCommandName.Install_dependencies;
        } else if ("update_dependencies".equals(value)) {
            return DeploymentCommandName.Update_dependencies;
        } else if ("update_custom_cookbooks".equals(value)) {
            return DeploymentCommandName.Update_custom_cookbooks;
        } else if ("execute_recipes".equals(value)) {
            return DeploymentCommandName.Execute_recipes;
        } else if ("deploy".equals(value)) {
            return DeploymentCommandName.Deploy;
        } else if ("rollback".equals(value)) {
            return DeploymentCommandName.Rollback;
        } else if ("start".equals(value)) {
            return DeploymentCommandName.Start;
        } else if ("stop".equals(value)) {
            return DeploymentCommandName.Stop;
        } else if ("restart".equals(value)) {
            return DeploymentCommandName.Restart;
        } else if ("undeploy".equals(value)) {
            return DeploymentCommandName.Undeploy;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    