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

import java.io.Serializable;

/**
 * <p>
 * Used to specify a stack or deployment command.
 * </p>
 */
public class DeploymentCommand implements Serializable, Cloneable {

    /**
     * Specifies the operation. You can specify only one command. <p>For
     * stacks, the following commands are available: <ul>
     * <li><code>execute_recipes</code>: Execute one or more recipes. To
     * specify the recipes, set an <code>Args</code> parameter named
     * <code>recipes</code> to the list of recipes to be executed. For
     * example, to execute <code>phpapp::appsetup</code>, set
     * <code>Args</code> to
     * <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     * <li><code>install_dependencies</code>: Install the stack's
     * dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     * the stack's custom cookbooks.</li>
     * <li><code>update_dependencies</code>: Update the stack's
     * dependencies.</li> </ul> <note>The update_dependencies and
     * install_dependencies commands are supported only for Linux instances.
     * You can run the commands successfully on Windows instances, but they
     * do nothing.</note> <p>For apps, the following commands are available:
     * <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     * an optional <code>Args</code> parameter named <code>migrate</code>.
     * Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     * The default setting is {"migrate":["false"]}.</li>
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
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, configure, setup, deploy, rollback, start, stop, restart, undeploy
     */
    private String name;

    /**
     * The arguments of those commands that take arguments. It should be set
     * to a JSON object with the following format: <p> <code>{"arg_name1" :
     * ["value1", "value2", ...], "arg_name2" : ["value1", "value2", ...],
     * ...}</code> <p>The <code>update_dependencies</code> command takes two
     * arguments: <ul> <li><code>upgrade_os_to</code> - Specifies the desired
     * Amazon Linux version for instances whose OS you want to upgrade, such
     * as <code>Amazon Linux 2014.09</code>. You must also set the
     * <code>allow_reboot</code> argument to true.</li>
     * <li><code>allow_reboot</code> - Specifies whether to allow AWS
     * OpsWorks to reboot the instances if necessary, after installing the
     * updates. This argument can be set to either <code>true</code> or
     * <code>false</code>. The default value is <code>false</code>.</li>
     * </ul> <p>For example, to upgrade an instance to Amazon Linux 2014.09,
     * set <code>Args</code> to the following. <code> {
     * "upgrade_os_to":["Amazon Linux 2014.09"], "allow_reboot":["true"] }
     * </code>
     */
    private java.util.Map<String,java.util.List<String>> args;

    /**
     * Specifies the operation. You can specify only one command. <p>For
     * stacks, the following commands are available: <ul>
     * <li><code>execute_recipes</code>: Execute one or more recipes. To
     * specify the recipes, set an <code>Args</code> parameter named
     * <code>recipes</code> to the list of recipes to be executed. For
     * example, to execute <code>phpapp::appsetup</code>, set
     * <code>Args</code> to
     * <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     * <li><code>install_dependencies</code>: Install the stack's
     * dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     * the stack's custom cookbooks.</li>
     * <li><code>update_dependencies</code>: Update the stack's
     * dependencies.</li> </ul> <note>The update_dependencies and
     * install_dependencies commands are supported only for Linux instances.
     * You can run the commands successfully on Windows instances, but they
     * do nothing.</note> <p>For apps, the following commands are available:
     * <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     * an optional <code>Args</code> parameter named <code>migrate</code>.
     * Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     * The default setting is {"migrate":["false"]}.</li>
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
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, configure, setup, deploy, rollback, start, stop, restart, undeploy
     *
     * @return Specifies the operation. You can specify only one command. <p>For
     *         stacks, the following commands are available: <ul>
     *         <li><code>execute_recipes</code>: Execute one or more recipes. To
     *         specify the recipes, set an <code>Args</code> parameter named
     *         <code>recipes</code> to the list of recipes to be executed. For
     *         example, to execute <code>phpapp::appsetup</code>, set
     *         <code>Args</code> to
     *         <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     *         <li><code>install_dependencies</code>: Install the stack's
     *         dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     *         the stack's custom cookbooks.</li>
     *         <li><code>update_dependencies</code>: Update the stack's
     *         dependencies.</li> </ul> <note>The update_dependencies and
     *         install_dependencies commands are supported only for Linux instances.
     *         You can run the commands successfully on Windows instances, but they
     *         do nothing.</note> <p>For apps, the following commands are available:
     *         <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     *         an optional <code>Args</code> parameter named <code>migrate</code>.
     *         Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     *         The default setting is {"migrate":["false"]}.</li>
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
     * Specifies the operation. You can specify only one command. <p>For
     * stacks, the following commands are available: <ul>
     * <li><code>execute_recipes</code>: Execute one or more recipes. To
     * specify the recipes, set an <code>Args</code> parameter named
     * <code>recipes</code> to the list of recipes to be executed. For
     * example, to execute <code>phpapp::appsetup</code>, set
     * <code>Args</code> to
     * <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     * <li><code>install_dependencies</code>: Install the stack's
     * dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     * the stack's custom cookbooks.</li>
     * <li><code>update_dependencies</code>: Update the stack's
     * dependencies.</li> </ul> <note>The update_dependencies and
     * install_dependencies commands are supported only for Linux instances.
     * You can run the commands successfully on Windows instances, but they
     * do nothing.</note> <p>For apps, the following commands are available:
     * <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     * an optional <code>Args</code> parameter named <code>migrate</code>.
     * Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     * The default setting is {"migrate":["false"]}.</li>
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
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, configure, setup, deploy, rollback, start, stop, restart, undeploy
     *
     * @param name Specifies the operation. You can specify only one command. <p>For
     *         stacks, the following commands are available: <ul>
     *         <li><code>execute_recipes</code>: Execute one or more recipes. To
     *         specify the recipes, set an <code>Args</code> parameter named
     *         <code>recipes</code> to the list of recipes to be executed. For
     *         example, to execute <code>phpapp::appsetup</code>, set
     *         <code>Args</code> to
     *         <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     *         <li><code>install_dependencies</code>: Install the stack's
     *         dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     *         the stack's custom cookbooks.</li>
     *         <li><code>update_dependencies</code>: Update the stack's
     *         dependencies.</li> </ul> <note>The update_dependencies and
     *         install_dependencies commands are supported only for Linux instances.
     *         You can run the commands successfully on Windows instances, but they
     *         do nothing.</note> <p>For apps, the following commands are available:
     *         <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     *         an optional <code>Args</code> parameter named <code>migrate</code>.
     *         Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     *         The default setting is {"migrate":["false"]}.</li>
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
     * Specifies the operation. You can specify only one command. <p>For
     * stacks, the following commands are available: <ul>
     * <li><code>execute_recipes</code>: Execute one or more recipes. To
     * specify the recipes, set an <code>Args</code> parameter named
     * <code>recipes</code> to the list of recipes to be executed. For
     * example, to execute <code>phpapp::appsetup</code>, set
     * <code>Args</code> to
     * <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     * <li><code>install_dependencies</code>: Install the stack's
     * dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     * the stack's custom cookbooks.</li>
     * <li><code>update_dependencies</code>: Update the stack's
     * dependencies.</li> </ul> <note>The update_dependencies and
     * install_dependencies commands are supported only for Linux instances.
     * You can run the commands successfully on Windows instances, but they
     * do nothing.</note> <p>For apps, the following commands are available:
     * <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     * an optional <code>Args</code> parameter named <code>migrate</code>.
     * Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     * The default setting is {"migrate":["false"]}.</li>
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
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, configure, setup, deploy, rollback, start, stop, restart, undeploy
     *
     * @param name Specifies the operation. You can specify only one command. <p>For
     *         stacks, the following commands are available: <ul>
     *         <li><code>execute_recipes</code>: Execute one or more recipes. To
     *         specify the recipes, set an <code>Args</code> parameter named
     *         <code>recipes</code> to the list of recipes to be executed. For
     *         example, to execute <code>phpapp::appsetup</code>, set
     *         <code>Args</code> to
     *         <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     *         <li><code>install_dependencies</code>: Install the stack's
     *         dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     *         the stack's custom cookbooks.</li>
     *         <li><code>update_dependencies</code>: Update the stack's
     *         dependencies.</li> </ul> <note>The update_dependencies and
     *         install_dependencies commands are supported only for Linux instances.
     *         You can run the commands successfully on Windows instances, but they
     *         do nothing.</note> <p>For apps, the following commands are available:
     *         <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     *         an optional <code>Args</code> parameter named <code>migrate</code>.
     *         Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     *         The default setting is {"migrate":["false"]}.</li>
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
     * Specifies the operation. You can specify only one command. <p>For
     * stacks, the following commands are available: <ul>
     * <li><code>execute_recipes</code>: Execute one or more recipes. To
     * specify the recipes, set an <code>Args</code> parameter named
     * <code>recipes</code> to the list of recipes to be executed. For
     * example, to execute <code>phpapp::appsetup</code>, set
     * <code>Args</code> to
     * <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     * <li><code>install_dependencies</code>: Install the stack's
     * dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     * the stack's custom cookbooks.</li>
     * <li><code>update_dependencies</code>: Update the stack's
     * dependencies.</li> </ul> <note>The update_dependencies and
     * install_dependencies commands are supported only for Linux instances.
     * You can run the commands successfully on Windows instances, but they
     * do nothing.</note> <p>For apps, the following commands are available:
     * <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     * an optional <code>Args</code> parameter named <code>migrate</code>.
     * Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     * The default setting is {"migrate":["false"]}.</li>
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
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, configure, setup, deploy, rollback, start, stop, restart, undeploy
     *
     * @param name Specifies the operation. You can specify only one command. <p>For
     *         stacks, the following commands are available: <ul>
     *         <li><code>execute_recipes</code>: Execute one or more recipes. To
     *         specify the recipes, set an <code>Args</code> parameter named
     *         <code>recipes</code> to the list of recipes to be executed. For
     *         example, to execute <code>phpapp::appsetup</code>, set
     *         <code>Args</code> to
     *         <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     *         <li><code>install_dependencies</code>: Install the stack's
     *         dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     *         the stack's custom cookbooks.</li>
     *         <li><code>update_dependencies</code>: Update the stack's
     *         dependencies.</li> </ul> <note>The update_dependencies and
     *         install_dependencies commands are supported only for Linux instances.
     *         You can run the commands successfully on Windows instances, but they
     *         do nothing.</note> <p>For apps, the following commands are available:
     *         <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     *         an optional <code>Args</code> parameter named <code>migrate</code>.
     *         Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     *         The default setting is {"migrate":["false"]}.</li>
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
     * Specifies the operation. You can specify only one command. <p>For
     * stacks, the following commands are available: <ul>
     * <li><code>execute_recipes</code>: Execute one or more recipes. To
     * specify the recipes, set an <code>Args</code> parameter named
     * <code>recipes</code> to the list of recipes to be executed. For
     * example, to execute <code>phpapp::appsetup</code>, set
     * <code>Args</code> to
     * <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     * <li><code>install_dependencies</code>: Install the stack's
     * dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     * the stack's custom cookbooks.</li>
     * <li><code>update_dependencies</code>: Update the stack's
     * dependencies.</li> </ul> <note>The update_dependencies and
     * install_dependencies commands are supported only for Linux instances.
     * You can run the commands successfully on Windows instances, but they
     * do nothing.</note> <p>For apps, the following commands are available:
     * <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     * an optional <code>Args</code> parameter named <code>migrate</code>.
     * Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     * The default setting is {"migrate":["false"]}.</li>
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
     * <b>Allowed Values: </b>install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, configure, setup, deploy, rollback, start, stop, restart, undeploy
     *
     * @param name Specifies the operation. You can specify only one command. <p>For
     *         stacks, the following commands are available: <ul>
     *         <li><code>execute_recipes</code>: Execute one or more recipes. To
     *         specify the recipes, set an <code>Args</code> parameter named
     *         <code>recipes</code> to the list of recipes to be executed. For
     *         example, to execute <code>phpapp::appsetup</code>, set
     *         <code>Args</code> to
     *         <code>{"recipes":["phpapp::appsetup"]}</code>.</li>
     *         <li><code>install_dependencies</code>: Install the stack's
     *         dependencies.</li> <li><code>update_custom_cookbooks</code>: Update
     *         the stack's custom cookbooks.</li>
     *         <li><code>update_dependencies</code>: Update the stack's
     *         dependencies.</li> </ul> <note>The update_dependencies and
     *         install_dependencies commands are supported only for Linux instances.
     *         You can run the commands successfully on Windows instances, but they
     *         do nothing.</note> <p>For apps, the following commands are available:
     *         <ul> <li><code>deploy</code>: Deploy an app. Ruby on Rails apps have
     *         an optional <code>Args</code> parameter named <code>migrate</code>.
     *         Set <code>Args</code> to {"migrate":["true"]} to migrate the database.
     *         The default setting is {"migrate":["false"]}.</li>
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
     * The arguments of those commands that take arguments. It should be set
     * to a JSON object with the following format: <p> <code>{"arg_name1" :
     * ["value1", "value2", ...], "arg_name2" : ["value1", "value2", ...],
     * ...}</code> <p>The <code>update_dependencies</code> command takes two
     * arguments: <ul> <li><code>upgrade_os_to</code> - Specifies the desired
     * Amazon Linux version for instances whose OS you want to upgrade, such
     * as <code>Amazon Linux 2014.09</code>. You must also set the
     * <code>allow_reboot</code> argument to true.</li>
     * <li><code>allow_reboot</code> - Specifies whether to allow AWS
     * OpsWorks to reboot the instances if necessary, after installing the
     * updates. This argument can be set to either <code>true</code> or
     * <code>false</code>. The default value is <code>false</code>.</li>
     * </ul> <p>For example, to upgrade an instance to Amazon Linux 2014.09,
     * set <code>Args</code> to the following. <code> {
     * "upgrade_os_to":["Amazon Linux 2014.09"], "allow_reboot":["true"] }
     * </code>
     *
     * @return The arguments of those commands that take arguments. It should be set
     *         to a JSON object with the following format: <p> <code>{"arg_name1" :
     *         ["value1", "value2", ...], "arg_name2" : ["value1", "value2", ...],
     *         ...}</code> <p>The <code>update_dependencies</code> command takes two
     *         arguments: <ul> <li><code>upgrade_os_to</code> - Specifies the desired
     *         Amazon Linux version for instances whose OS you want to upgrade, such
     *         as <code>Amazon Linux 2014.09</code>. You must also set the
     *         <code>allow_reboot</code> argument to true.</li>
     *         <li><code>allow_reboot</code> - Specifies whether to allow AWS
     *         OpsWorks to reboot the instances if necessary, after installing the
     *         updates. This argument can be set to either <code>true</code> or
     *         <code>false</code>. The default value is <code>false</code>.</li>
     *         </ul> <p>For example, to upgrade an instance to Amazon Linux 2014.09,
     *         set <code>Args</code> to the following. <code> {
     *         "upgrade_os_to":["Amazon Linux 2014.09"], "allow_reboot":["true"] }
     *         </code>
     */
    public java.util.Map<String,java.util.List<String>> getArgs() {
        
        if (args == null) {
            args = new java.util.HashMap<String,java.util.List<String>>();
        }
        return args;
    }
    
    /**
     * The arguments of those commands that take arguments. It should be set
     * to a JSON object with the following format: <p> <code>{"arg_name1" :
     * ["value1", "value2", ...], "arg_name2" : ["value1", "value2", ...],
     * ...}</code> <p>The <code>update_dependencies</code> command takes two
     * arguments: <ul> <li><code>upgrade_os_to</code> - Specifies the desired
     * Amazon Linux version for instances whose OS you want to upgrade, such
     * as <code>Amazon Linux 2014.09</code>. You must also set the
     * <code>allow_reboot</code> argument to true.</li>
     * <li><code>allow_reboot</code> - Specifies whether to allow AWS
     * OpsWorks to reboot the instances if necessary, after installing the
     * updates. This argument can be set to either <code>true</code> or
     * <code>false</code>. The default value is <code>false</code>.</li>
     * </ul> <p>For example, to upgrade an instance to Amazon Linux 2014.09,
     * set <code>Args</code> to the following. <code> {
     * "upgrade_os_to":["Amazon Linux 2014.09"], "allow_reboot":["true"] }
     * </code>
     *
     * @param args The arguments of those commands that take arguments. It should be set
     *         to a JSON object with the following format: <p> <code>{"arg_name1" :
     *         ["value1", "value2", ...], "arg_name2" : ["value1", "value2", ...],
     *         ...}</code> <p>The <code>update_dependencies</code> command takes two
     *         arguments: <ul> <li><code>upgrade_os_to</code> - Specifies the desired
     *         Amazon Linux version for instances whose OS you want to upgrade, such
     *         as <code>Amazon Linux 2014.09</code>. You must also set the
     *         <code>allow_reboot</code> argument to true.</li>
     *         <li><code>allow_reboot</code> - Specifies whether to allow AWS
     *         OpsWorks to reboot the instances if necessary, after installing the
     *         updates. This argument can be set to either <code>true</code> or
     *         <code>false</code>. The default value is <code>false</code>.</li>
     *         </ul> <p>For example, to upgrade an instance to Amazon Linux 2014.09,
     *         set <code>Args</code> to the following. <code> {
     *         "upgrade_os_to":["Amazon Linux 2014.09"], "allow_reboot":["true"] }
     *         </code>
     */
    public void setArgs(java.util.Map<String,java.util.List<String>> args) {
        this.args = args;
    }
    
    /**
     * The arguments of those commands that take arguments. It should be set
     * to a JSON object with the following format: <p> <code>{"arg_name1" :
     * ["value1", "value2", ...], "arg_name2" : ["value1", "value2", ...],
     * ...}</code> <p>The <code>update_dependencies</code> command takes two
     * arguments: <ul> <li><code>upgrade_os_to</code> - Specifies the desired
     * Amazon Linux version for instances whose OS you want to upgrade, such
     * as <code>Amazon Linux 2014.09</code>. You must also set the
     * <code>allow_reboot</code> argument to true.</li>
     * <li><code>allow_reboot</code> - Specifies whether to allow AWS
     * OpsWorks to reboot the instances if necessary, after installing the
     * updates. This argument can be set to either <code>true</code> or
     * <code>false</code>. The default value is <code>false</code>.</li>
     * </ul> <p>For example, to upgrade an instance to Amazon Linux 2014.09,
     * set <code>Args</code> to the following. <code> {
     * "upgrade_os_to":["Amazon Linux 2014.09"], "allow_reboot":["true"] }
     * </code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args The arguments of those commands that take arguments. It should be set
     *         to a JSON object with the following format: <p> <code>{"arg_name1" :
     *         ["value1", "value2", ...], "arg_name2" : ["value1", "value2", ...],
     *         ...}</code> <p>The <code>update_dependencies</code> command takes two
     *         arguments: <ul> <li><code>upgrade_os_to</code> - Specifies the desired
     *         Amazon Linux version for instances whose OS you want to upgrade, such
     *         as <code>Amazon Linux 2014.09</code>. You must also set the
     *         <code>allow_reboot</code> argument to true.</li>
     *         <li><code>allow_reboot</code> - Specifies whether to allow AWS
     *         OpsWorks to reboot the instances if necessary, after installing the
     *         updates. This argument can be set to either <code>true</code> or
     *         <code>false</code>. The default value is <code>false</code>.</li>
     *         </ul> <p>For example, to upgrade an instance to Amazon Linux 2014.09,
     *         set <code>Args</code> to the following. <code> {
     *         "upgrade_os_to":["Amazon Linux 2014.09"], "allow_reboot":["true"] }
     *         </code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentCommand withArgs(java.util.Map<String,java.util.List<String>> args) {
        setArgs(args);
        return this;
    }

    /**
     * The arguments of those commands that take arguments. It should be set
     * to a JSON object with the following format: <p> <code>{"arg_name1" :
     * ["value1", "value2", ...], "arg_name2" : ["value1", "value2", ...],
     * ...}</code> <p>The <code>update_dependencies</code> command takes two
     * arguments: <ul> <li><code>upgrade_os_to</code> - Specifies the desired
     * Amazon Linux version for instances whose OS you want to upgrade, such
     * as <code>Amazon Linux 2014.09</code>. You must also set the
     * <code>allow_reboot</code> argument to true.</li>
     * <li><code>allow_reboot</code> - Specifies whether to allow AWS
     * OpsWorks to reboot the instances if necessary, after installing the
     * updates. This argument can be set to either <code>true</code> or
     * <code>false</code>. The default value is <code>false</code>.</li>
     * </ul> <p>For example, to upgrade an instance to Amazon Linux 2014.09,
     * set <code>Args</code> to the following. <code> {
     * "upgrade_os_to":["Amazon Linux 2014.09"], "allow_reboot":["true"] }
     * </code>
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
    
    @Override
    public DeploymentCommand clone() {
        try {
            return (DeploymentCommand) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    