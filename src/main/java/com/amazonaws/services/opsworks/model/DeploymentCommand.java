/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * <p>
 * Used to specify a deployment operation.
 * </p>
 */
public class DeploymentCommand implements Serializable {

    /**
     * Specifies the deployment operation. You can specify only one command.
     * <p>For stacks, the available commands are: <ul>
     * <li><code></code>execute_recipes: Execute the recipes that are
     * specified by the <code>Args</code> parameter.</li>
     * <li><code></code>install_dependencies: Installs the stack's
     * dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     * the stack's custom cookbooks.</li>
     * <li><code></code>update_dependencies: Update the stack's
     * dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     * <li><code>deploy</code>: Deploy the app.</li>
     * <li><code>rollback</code> Roll the app back to the previous version.
     * When you update an app, AWS OpsWorks stores the previous version, up
     * to a maximum of five versions. You can use this command to roll an app
     * back as many as four versions.</li> <li><code>start</code>: Start the
     * app's web or application server.</li> <li><code>stop</code>: Stop the
     * app's web or application server.</li> <li><code>restart</code>:
     * Restart the app's web or application server.</li>
     * <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, deploy, rollback, start, stop, restart, undeploy
     */
    private String name;

    /**
     * An array of command arguments. This parameter is currently used only
     * to specify the list of recipes to be executed by the
     * <code>ExecuteRecipes</code> command.
     */
    private java.util.Map<String,java.util.List<String>> args;

    /**
     * Specifies the deployment operation. You can specify only one command.
     * <p>For stacks, the available commands are: <ul>
     * <li><code></code>execute_recipes: Execute the recipes that are
     * specified by the <code>Args</code> parameter.</li>
     * <li><code></code>install_dependencies: Installs the stack's
     * dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     * the stack's custom cookbooks.</li>
     * <li><code></code>update_dependencies: Update the stack's
     * dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     * <li><code>deploy</code>: Deploy the app.</li>
     * <li><code>rollback</code> Roll the app back to the previous version.
     * When you update an app, AWS OpsWorks stores the previous version, up
     * to a maximum of five versions. You can use this command to roll an app
     * back as many as four versions.</li> <li><code>start</code>: Start the
     * app's web or application server.</li> <li><code>stop</code>: Stop the
     * app's web or application server.</li> <li><code>restart</code>:
     * Restart the app's web or application server.</li>
     * <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, deploy, rollback, start, stop, restart, undeploy
     *
     * @return Specifies the deployment operation. You can specify only one command.
     *         <p>For stacks, the available commands are: <ul>
     *         <li><code></code>execute_recipes: Execute the recipes that are
     *         specified by the <code>Args</code> parameter.</li>
     *         <li><code></code>install_dependencies: Installs the stack's
     *         dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     *         the stack's custom cookbooks.</li>
     *         <li><code></code>update_dependencies: Update the stack's
     *         dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     *         <li><code>deploy</code>: Deploy the app.</li>
     *         <li><code>rollback</code> Roll the app back to the previous version.
     *         When you update an app, AWS OpsWorks stores the previous version, up
     *         to a maximum of five versions. You can use this command to roll an app
     *         back as many as four versions.</li> <li><code>start</code>: Start the
     *         app's web or application server.</li> <li><code>stop</code>: Stop the
     *         app's web or application server.</li> <li><code>restart</code>:
     *         Restart the app's web or application server.</li>
     *         <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     *
     * @see DeploymentCommandName
     */
    public String getName() {
        return name;
    }
    
    /**
     * Specifies the deployment operation. You can specify only one command.
     * <p>For stacks, the available commands are: <ul>
     * <li><code></code>execute_recipes: Execute the recipes that are
     * specified by the <code>Args</code> parameter.</li>
     * <li><code></code>install_dependencies: Installs the stack's
     * dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     * the stack's custom cookbooks.</li>
     * <li><code></code>update_dependencies: Update the stack's
     * dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     * <li><code>deploy</code>: Deploy the app.</li>
     * <li><code>rollback</code> Roll the app back to the previous version.
     * When you update an app, AWS OpsWorks stores the previous version, up
     * to a maximum of five versions. You can use this command to roll an app
     * back as many as four versions.</li> <li><code>start</code>: Start the
     * app's web or application server.</li> <li><code>stop</code>: Stop the
     * app's web or application server.</li> <li><code>restart</code>:
     * Restart the app's web or application server.</li>
     * <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, deploy, rollback, start, stop, restart, undeploy
     *
     * @param name Specifies the deployment operation. You can specify only one command.
     *         <p>For stacks, the available commands are: <ul>
     *         <li><code></code>execute_recipes: Execute the recipes that are
     *         specified by the <code>Args</code> parameter.</li>
     *         <li><code></code>install_dependencies: Installs the stack's
     *         dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     *         the stack's custom cookbooks.</li>
     *         <li><code></code>update_dependencies: Update the stack's
     *         dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     *         <li><code>deploy</code>: Deploy the app.</li>
     *         <li><code>rollback</code> Roll the app back to the previous version.
     *         When you update an app, AWS OpsWorks stores the previous version, up
     *         to a maximum of five versions. You can use this command to roll an app
     *         back as many as four versions.</li> <li><code>start</code>: Start the
     *         app's web or application server.</li> <li><code>stop</code>: Stop the
     *         app's web or application server.</li> <li><code>restart</code>:
     *         Restart the app's web or application server.</li>
     *         <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     *
     * @see DeploymentCommandName
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Specifies the deployment operation. You can specify only one command.
     * <p>For stacks, the available commands are: <ul>
     * <li><code></code>execute_recipes: Execute the recipes that are
     * specified by the <code>Args</code> parameter.</li>
     * <li><code></code>install_dependencies: Installs the stack's
     * dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     * the stack's custom cookbooks.</li>
     * <li><code></code>update_dependencies: Update the stack's
     * dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     * <li><code>deploy</code>: Deploy the app.</li>
     * <li><code>rollback</code> Roll the app back to the previous version.
     * When you update an app, AWS OpsWorks stores the previous version, up
     * to a maximum of five versions. You can use this command to roll an app
     * back as many as four versions.</li> <li><code>start</code>: Start the
     * app's web or application server.</li> <li><code>stop</code>: Stop the
     * app's web or application server.</li> <li><code>restart</code>:
     * Restart the app's web or application server.</li>
     * <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, deploy, rollback, start, stop, restart, undeploy
     *
     * @param name Specifies the deployment operation. You can specify only one command.
     *         <p>For stacks, the available commands are: <ul>
     *         <li><code></code>execute_recipes: Execute the recipes that are
     *         specified by the <code>Args</code> parameter.</li>
     *         <li><code></code>install_dependencies: Installs the stack's
     *         dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     *         the stack's custom cookbooks.</li>
     *         <li><code></code>update_dependencies: Update the stack's
     *         dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     *         <li><code>deploy</code>: Deploy the app.</li>
     *         <li><code>rollback</code> Roll the app back to the previous version.
     *         When you update an app, AWS OpsWorks stores the previous version, up
     *         to a maximum of five versions. You can use this command to roll an app
     *         back as many as four versions.</li> <li><code>start</code>: Start the
     *         app's web or application server.</li> <li><code>stop</code>: Stop the
     *         app's web or application server.</li> <li><code>restart</code>:
     *         Restart the app's web or application server.</li>
     *         <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DeploymentCommandName
     */
    public DeploymentCommand withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Specifies the deployment operation. You can specify only one command.
     * <p>For stacks, the available commands are: <ul>
     * <li><code></code>execute_recipes: Execute the recipes that are
     * specified by the <code>Args</code> parameter.</li>
     * <li><code></code>install_dependencies: Installs the stack's
     * dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     * the stack's custom cookbooks.</li>
     * <li><code></code>update_dependencies: Update the stack's
     * dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     * <li><code>deploy</code>: Deploy the app.</li>
     * <li><code>rollback</code> Roll the app back to the previous version.
     * When you update an app, AWS OpsWorks stores the previous version, up
     * to a maximum of five versions. You can use this command to roll an app
     * back as many as four versions.</li> <li><code>start</code>: Start the
     * app's web or application server.</li> <li><code>stop</code>: Stop the
     * app's web or application server.</li> <li><code>restart</code>:
     * Restart the app's web or application server.</li>
     * <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, deploy, rollback, start, stop, restart, undeploy
     *
     * @param name Specifies the deployment operation. You can specify only one command.
     *         <p>For stacks, the available commands are: <ul>
     *         <li><code></code>execute_recipes: Execute the recipes that are
     *         specified by the <code>Args</code> parameter.</li>
     *         <li><code></code>install_dependencies: Installs the stack's
     *         dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     *         the stack's custom cookbooks.</li>
     *         <li><code></code>update_dependencies: Update the stack's
     *         dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     *         <li><code>deploy</code>: Deploy the app.</li>
     *         <li><code>rollback</code> Roll the app back to the previous version.
     *         When you update an app, AWS OpsWorks stores the previous version, up
     *         to a maximum of five versions. You can use this command to roll an app
     *         back as many as four versions.</li> <li><code>start</code>: Start the
     *         app's web or application server.</li> <li><code>stop</code>: Stop the
     *         app's web or application server.</li> <li><code>restart</code>:
     *         Restart the app's web or application server.</li>
     *         <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     *
     * @see DeploymentCommandName
     */
    public void setName(DeploymentCommandName name) {
        this.name = name.toString();
    }
    
    /**
     * Specifies the deployment operation. You can specify only one command.
     * <p>For stacks, the available commands are: <ul>
     * <li><code></code>execute_recipes: Execute the recipes that are
     * specified by the <code>Args</code> parameter.</li>
     * <li><code></code>install_dependencies: Installs the stack's
     * dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     * the stack's custom cookbooks.</li>
     * <li><code></code>update_dependencies: Update the stack's
     * dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     * <li><code>deploy</code>: Deploy the app.</li>
     * <li><code>rollback</code> Roll the app back to the previous version.
     * When you update an app, AWS OpsWorks stores the previous version, up
     * to a maximum of five versions. You can use this command to roll an app
     * back as many as four versions.</li> <li><code>start</code>: Start the
     * app's web or application server.</li> <li><code>stop</code>: Stop the
     * app's web or application server.</li> <li><code>restart</code>:
     * Restart the app's web or application server.</li>
     * <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, deploy, rollback, start, stop, restart, undeploy
     *
     * @param name Specifies the deployment operation. You can specify only one command.
     *         <p>For stacks, the available commands are: <ul>
     *         <li><code></code>execute_recipes: Execute the recipes that are
     *         specified by the <code>Args</code> parameter.</li>
     *         <li><code></code>install_dependencies: Installs the stack's
     *         dependencies.</li> <li><code></code>update_custom_cookbooks: Update
     *         the stack's custom cookbooks.</li>
     *         <li><code></code>update_dependencies: Update the stack's
     *         dependencies.</li> </ul> <p>For apps, the available commands are: <ul>
     *         <li><code>deploy</code>: Deploy the app.</li>
     *         <li><code>rollback</code> Roll the app back to the previous version.
     *         When you update an app, AWS OpsWorks stores the previous version, up
     *         to a maximum of five versions. You can use this command to roll an app
     *         back as many as four versions.</li> <li><code>start</code>: Start the
     *         app's web or application server.</li> <li><code>stop</code>: Stop the
     *         app's web or application server.</li> <li><code>restart</code>:
     *         Restart the app's web or application server.</li>
     *         <li><code>undeploy</code>: Undeploy the app.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DeploymentCommandName
     */
    public DeploymentCommand withName(DeploymentCommandName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * An array of command arguments. This parameter is currently used only
     * to specify the list of recipes to be executed by the
     * <code>ExecuteRecipes</code> command.
     *
     * @return An array of command arguments. This parameter is currently used only
     *         to specify the list of recipes to be executed by the
     *         <code>ExecuteRecipes</code> command.
     */
    public java.util.Map<String,java.util.List<String>> getArgs() {
        
        if (args == null) {
            args = new java.util.HashMap<String,java.util.List<String>>();
        }
        return args;
    }
    
    /**
     * An array of command arguments. This parameter is currently used only
     * to specify the list of recipes to be executed by the
     * <code>ExecuteRecipes</code> command.
     *
     * @param args An array of command arguments. This parameter is currently used only
     *         to specify the list of recipes to be executed by the
     *         <code>ExecuteRecipes</code> command.
     */
    public void setArgs(java.util.Map<String,java.util.List<String>> args) {
        this.args = args;
    }
    
    /**
     * An array of command arguments. This parameter is currently used only
     * to specify the list of recipes to be executed by the
     * <code>ExecuteRecipes</code> command.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args An array of command arguments. This parameter is currently used only
     *         to specify the list of recipes to be executed by the
     *         <code>ExecuteRecipes</code> command.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeploymentCommand withArgs(java.util.Map<String,java.util.List<String>> args) {
        setArgs(args);
        return this;
    }

    /**
     * An array of command arguments. This parameter is currently used only
     * to specify the list of recipes to be executed by the
     * <code>ExecuteRecipes</code> command.
     * <p>
     * The method adds a new key-value pair into Args parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Args.
     * @param value The corresponding value of the entry to be added into Args.
     */
	public DeploymentCommand addArgsEntry(String key, java.util.List<String> value) {
		if (null == this.args) {
			this.args = new java.util.HashMap<String,java.util.List<String>>();
		}
		if (this.args.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.args.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Args.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public DeploymentCommand clearArgsEntries() {
		this.args = null;
		return this;
	}
	
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getArgs() != null) sb.append("Args: " + getArgs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeploymentCommand == false) return false;
        DeploymentCommand other = (DeploymentCommand)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getArgs() == null ^ this.getArgs() == null) return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false) return false; 
        return true;
    }
    
}
    