/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that allows Proton to provision infrastructure using
     * CodeBuild-based provisioning on your behalf.
     * </p>
     * <p>
     * To use CodeBuild-based provisioning for the environment or for any service instance running in the environment,
     * specify either the <code>environmentAccountConnectionId</code> or <code>codebuildRoleArn</code> parameter.
     * </p>
     */
    private String codebuildRoleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     * components in this environment. It determines the scope of infrastructure that a component can provision.
     * </p>
     * <p>
     * You must specify <code>componentRoleArn</code> to allow directly defined components to be associated with this
     * environment.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     */
    private String componentRoleArn;
    /**
     * <p>
     * A description of the environment that's being created and deployed.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the environment account connection that you provide if you're provisioning your environment
     * infrastructure resources to an environment account. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * <p>
     * To use Amazon Web Services-managed provisioning for the environment, specify either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     * <code>provisioningRepository</code> parameter.
     * </p>
     */
    private String environmentAccountConnectionId;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Proton service role that allows Proton to make calls to other services on
     * your behalf.
     * </p>
     * <p>
     * To use Amazon Web Services-managed provisioning for the environment, specify either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     * <code>provisioningRepository</code> parameter.
     * </p>
     */
    private String protonServiceRoleArn;
    /**
     * <p>
     * The linked repository that you use to host your rendered infrastructure templates for self-managed provisioning.
     * A linked repository is a repository that has been registered with Proton. For more information, see
     * <a>CreateRepository</a>.
     * </p>
     * <p>
     * To use self-managed provisioning for the environment, specify this parameter and omit the
     * <code>environmentAccountConnectionId</code> and <code>protonServiceRoleArn</code> parameters.
     * </p>
     */
    private RepositoryBranchInput provisioningRepository;
    /**
     * <p>
     * A YAML formatted string that provides inputs as defined in the environment template bundle schema file. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> in the <i>Proton
     * User Guide</i>.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton environment. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The major version of the environment template.
     * </p>
     */
    private String templateMajorVersion;
    /**
     * <p>
     * The minor version of the environment template.
     * </p>
     */
    private String templateMinorVersion;
    /**
     * <p>
     * The name of the environment template. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Environment Templates</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that allows Proton to provision infrastructure using
     * CodeBuild-based provisioning on your behalf.
     * </p>
     * <p>
     * To use CodeBuild-based provisioning for the environment or for any service instance running in the environment,
     * specify either the <code>environmentAccountConnectionId</code> or <code>codebuildRoleArn</code> parameter.
     * </p>
     * 
     * @param codebuildRoleArn
     *        The Amazon Resource Name (ARN) of the IAM service role that allows Proton to provision infrastructure
     *        using CodeBuild-based provisioning on your behalf.</p>
     *        <p>
     *        To use CodeBuild-based provisioning for the environment or for any service instance running in the
     *        environment, specify either the <code>environmentAccountConnectionId</code> or
     *        <code>codebuildRoleArn</code> parameter.
     */

    public void setCodebuildRoleArn(String codebuildRoleArn) {
        this.codebuildRoleArn = codebuildRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that allows Proton to provision infrastructure using
     * CodeBuild-based provisioning on your behalf.
     * </p>
     * <p>
     * To use CodeBuild-based provisioning for the environment or for any service instance running in the environment,
     * specify either the <code>environmentAccountConnectionId</code> or <code>codebuildRoleArn</code> parameter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM service role that allows Proton to provision infrastructure
     *         using CodeBuild-based provisioning on your behalf.</p>
     *         <p>
     *         To use CodeBuild-based provisioning for the environment or for any service instance running in the
     *         environment, specify either the <code>environmentAccountConnectionId</code> or
     *         <code>codebuildRoleArn</code> parameter.
     */

    public String getCodebuildRoleArn() {
        return this.codebuildRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that allows Proton to provision infrastructure using
     * CodeBuild-based provisioning on your behalf.
     * </p>
     * <p>
     * To use CodeBuild-based provisioning for the environment or for any service instance running in the environment,
     * specify either the <code>environmentAccountConnectionId</code> or <code>codebuildRoleArn</code> parameter.
     * </p>
     * 
     * @param codebuildRoleArn
     *        The Amazon Resource Name (ARN) of the IAM service role that allows Proton to provision infrastructure
     *        using CodeBuild-based provisioning on your behalf.</p>
     *        <p>
     *        To use CodeBuild-based provisioning for the environment or for any service instance running in the
     *        environment, specify either the <code>environmentAccountConnectionId</code> or
     *        <code>codebuildRoleArn</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withCodebuildRoleArn(String codebuildRoleArn) {
        setCodebuildRoleArn(codebuildRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     * components in this environment. It determines the scope of infrastructure that a component can provision.
     * </p>
     * <p>
     * You must specify <code>componentRoleArn</code> to allow directly defined components to be associated with this
     * environment.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param componentRoleArn
     *        The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     *        components in this environment. It determines the scope of infrastructure that a component can
     *        provision.</p>
     *        <p>
     *        You must specify <code>componentRoleArn</code> to allow directly defined components to be associated with
     *        this environment.
     *        </p>
     *        <p>
     *        For more information about components, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     *        <i>Proton User Guide</i>.
     */

    public void setComponentRoleArn(String componentRoleArn) {
        this.componentRoleArn = componentRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     * components in this environment. It determines the scope of infrastructure that a component can provision.
     * </p>
     * <p>
     * You must specify <code>componentRoleArn</code> to allow directly defined components to be associated with this
     * environment.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly
     *         defined components in this environment. It determines the scope of infrastructure that a component can
     *         provision.</p>
     *         <p>
     *         You must specify <code>componentRoleArn</code> to allow directly defined components to be associated with
     *         this environment.
     *         </p>
     *         <p>
     *         For more information about components, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in
     *         the <i>Proton User Guide</i>.
     */

    public String getComponentRoleArn() {
        return this.componentRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     * components in this environment. It determines the scope of infrastructure that a component can provision.
     * </p>
     * <p>
     * You must specify <code>componentRoleArn</code> to allow directly defined components to be associated with this
     * environment.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param componentRoleArn
     *        The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined
     *        components in this environment. It determines the scope of infrastructure that a component can
     *        provision.</p>
     *        <p>
     *        You must specify <code>componentRoleArn</code> to allow directly defined components to be associated with
     *        this environment.
     *        </p>
     *        <p>
     *        For more information about components, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     *        <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withComponentRoleArn(String componentRoleArn) {
        setComponentRoleArn(componentRoleArn);
        return this;
    }

    /**
     * <p>
     * A description of the environment that's being created and deployed.
     * </p>
     * 
     * @param description
     *        A description of the environment that's being created and deployed.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the environment that's being created and deployed.
     * </p>
     * 
     * @return A description of the environment that's being created and deployed.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the environment that's being created and deployed.
     * </p>
     * 
     * @param description
     *        A description of the environment that's being created and deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the environment account connection that you provide if you're provisioning your environment
     * infrastructure resources to an environment account. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * <p>
     * To use Amazon Web Services-managed provisioning for the environment, specify either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     * <code>provisioningRepository</code> parameter.
     * </p>
     * 
     * @param environmentAccountConnectionId
     *        The ID of the environment account connection that you provide if you're provisioning your environment
     *        infrastructure resources to an environment account. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment
     *        account connections</a> in the <i>Proton User guide</i>.</p>
     *        <p>
     *        To use Amazon Web Services-managed provisioning for the environment, specify either the
     *        <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     *        <code>provisioningRepository</code> parameter.
     */

    public void setEnvironmentAccountConnectionId(String environmentAccountConnectionId) {
        this.environmentAccountConnectionId = environmentAccountConnectionId;
    }

    /**
     * <p>
     * The ID of the environment account connection that you provide if you're provisioning your environment
     * infrastructure resources to an environment account. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * <p>
     * To use Amazon Web Services-managed provisioning for the environment, specify either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     * <code>provisioningRepository</code> parameter.
     * </p>
     * 
     * @return The ID of the environment account connection that you provide if you're provisioning your environment
     *         infrastructure resources to an environment account. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment
     *         account connections</a> in the <i>Proton User guide</i>.</p>
     *         <p>
     *         To use Amazon Web Services-managed provisioning for the environment, specify either the
     *         <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     *         <code>provisioningRepository</code> parameter.
     */

    public String getEnvironmentAccountConnectionId() {
        return this.environmentAccountConnectionId;
    }

    /**
     * <p>
     * The ID of the environment account connection that you provide if you're provisioning your environment
     * infrastructure resources to an environment account. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * <p>
     * To use Amazon Web Services-managed provisioning for the environment, specify either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     * <code>provisioningRepository</code> parameter.
     * </p>
     * 
     * @param environmentAccountConnectionId
     *        The ID of the environment account connection that you provide if you're provisioning your environment
     *        infrastructure resources to an environment account. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment
     *        account connections</a> in the <i>Proton User guide</i>.</p>
     *        <p>
     *        To use Amazon Web Services-managed provisioning for the environment, specify either the
     *        <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     *        <code>provisioningRepository</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withEnvironmentAccountConnectionId(String environmentAccountConnectionId) {
        setEnvironmentAccountConnectionId(environmentAccountConnectionId);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Proton service role that allows Proton to make calls to other services on
     * your behalf.
     * </p>
     * <p>
     * To use Amazon Web Services-managed provisioning for the environment, specify either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     * <code>provisioningRepository</code> parameter.
     * </p>
     * 
     * @param protonServiceRoleArn
     *        The Amazon Resource Name (ARN) of the Proton service role that allows Proton to make calls to other
     *        services on your behalf.</p>
     *        <p>
     *        To use Amazon Web Services-managed provisioning for the environment, specify either the
     *        <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     *        <code>provisioningRepository</code> parameter.
     */

    public void setProtonServiceRoleArn(String protonServiceRoleArn) {
        this.protonServiceRoleArn = protonServiceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Proton service role that allows Proton to make calls to other services on
     * your behalf.
     * </p>
     * <p>
     * To use Amazon Web Services-managed provisioning for the environment, specify either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     * <code>provisioningRepository</code> parameter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Proton service role that allows Proton to make calls to other
     *         services on your behalf.</p>
     *         <p>
     *         To use Amazon Web Services-managed provisioning for the environment, specify either the
     *         <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     *         <code>provisioningRepository</code> parameter.
     */

    public String getProtonServiceRoleArn() {
        return this.protonServiceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Proton service role that allows Proton to make calls to other services on
     * your behalf.
     * </p>
     * <p>
     * To use Amazon Web Services-managed provisioning for the environment, specify either the
     * <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     * <code>provisioningRepository</code> parameter.
     * </p>
     * 
     * @param protonServiceRoleArn
     *        The Amazon Resource Name (ARN) of the Proton service role that allows Proton to make calls to other
     *        services on your behalf.</p>
     *        <p>
     *        To use Amazon Web Services-managed provisioning for the environment, specify either the
     *        <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code> parameter and omit the
     *        <code>provisioningRepository</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withProtonServiceRoleArn(String protonServiceRoleArn) {
        setProtonServiceRoleArn(protonServiceRoleArn);
        return this;
    }

    /**
     * <p>
     * The linked repository that you use to host your rendered infrastructure templates for self-managed provisioning.
     * A linked repository is a repository that has been registered with Proton. For more information, see
     * <a>CreateRepository</a>.
     * </p>
     * <p>
     * To use self-managed provisioning for the environment, specify this parameter and omit the
     * <code>environmentAccountConnectionId</code> and <code>protonServiceRoleArn</code> parameters.
     * </p>
     * 
     * @param provisioningRepository
     *        The linked repository that you use to host your rendered infrastructure templates for self-managed
     *        provisioning. A linked repository is a repository that has been registered with Proton. For more
     *        information, see <a>CreateRepository</a>.</p>
     *        <p>
     *        To use self-managed provisioning for the environment, specify this parameter and omit the
     *        <code>environmentAccountConnectionId</code> and <code>protonServiceRoleArn</code> parameters.
     */

    public void setProvisioningRepository(RepositoryBranchInput provisioningRepository) {
        this.provisioningRepository = provisioningRepository;
    }

    /**
     * <p>
     * The linked repository that you use to host your rendered infrastructure templates for self-managed provisioning.
     * A linked repository is a repository that has been registered with Proton. For more information, see
     * <a>CreateRepository</a>.
     * </p>
     * <p>
     * To use self-managed provisioning for the environment, specify this parameter and omit the
     * <code>environmentAccountConnectionId</code> and <code>protonServiceRoleArn</code> parameters.
     * </p>
     * 
     * @return The linked repository that you use to host your rendered infrastructure templates for self-managed
     *         provisioning. A linked repository is a repository that has been registered with Proton. For more
     *         information, see <a>CreateRepository</a>.</p>
     *         <p>
     *         To use self-managed provisioning for the environment, specify this parameter and omit the
     *         <code>environmentAccountConnectionId</code> and <code>protonServiceRoleArn</code> parameters.
     */

    public RepositoryBranchInput getProvisioningRepository() {
        return this.provisioningRepository;
    }

    /**
     * <p>
     * The linked repository that you use to host your rendered infrastructure templates for self-managed provisioning.
     * A linked repository is a repository that has been registered with Proton. For more information, see
     * <a>CreateRepository</a>.
     * </p>
     * <p>
     * To use self-managed provisioning for the environment, specify this parameter and omit the
     * <code>environmentAccountConnectionId</code> and <code>protonServiceRoleArn</code> parameters.
     * </p>
     * 
     * @param provisioningRepository
     *        The linked repository that you use to host your rendered infrastructure templates for self-managed
     *        provisioning. A linked repository is a repository that has been registered with Proton. For more
     *        information, see <a>CreateRepository</a>.</p>
     *        <p>
     *        To use self-managed provisioning for the environment, specify this parameter and omit the
     *        <code>environmentAccountConnectionId</code> and <code>protonServiceRoleArn</code> parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withProvisioningRepository(RepositoryBranchInput provisioningRepository) {
        setProvisioningRepository(provisioningRepository);
        return this;
    }

    /**
     * <p>
     * A YAML formatted string that provides inputs as defined in the environment template bundle schema file. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> in the <i>Proton
     * User Guide</i>.
     * </p>
     * 
     * @param spec
     *        A YAML formatted string that provides inputs as defined in the environment template bundle schema file.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> in the
     *        <i>Proton User Guide</i>.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * A YAML formatted string that provides inputs as defined in the environment template bundle schema file. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> in the <i>Proton
     * User Guide</i>.
     * </p>
     * 
     * @return A YAML formatted string that provides inputs as defined in the environment template bundle schema file.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> in the
     *         <i>Proton User Guide</i>.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * A YAML formatted string that provides inputs as defined in the environment template bundle schema file. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> in the <i>Proton
     * User Guide</i>.
     * </p>
     * 
     * @param spec
     *        A YAML formatted string that provides inputs as defined in the environment template bundle schema file.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> in the
     *        <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton environment. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @return An optional list of metadata items that you can associate with the Proton environment. A tag is a
     *         key-value pair.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and
     *         tagging</a> in the <i>Proton User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton environment. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton environment. A tag is a
     *        key-value pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton environment. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton environment. A tag is a
     *        key-value pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of metadata items that you can associate with the Proton environment. A tag is a key-value pair.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An optional list of metadata items that you can associate with the Proton environment. A tag is a
     *        key-value pair.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a>
     *        in the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The major version of the environment template.
     * </p>
     * 
     * @param templateMajorVersion
     *        The major version of the environment template.
     */

    public void setTemplateMajorVersion(String templateMajorVersion) {
        this.templateMajorVersion = templateMajorVersion;
    }

    /**
     * <p>
     * The major version of the environment template.
     * </p>
     * 
     * @return The major version of the environment template.
     */

    public String getTemplateMajorVersion() {
        return this.templateMajorVersion;
    }

    /**
     * <p>
     * The major version of the environment template.
     * </p>
     * 
     * @param templateMajorVersion
     *        The major version of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTemplateMajorVersion(String templateMajorVersion) {
        setTemplateMajorVersion(templateMajorVersion);
        return this;
    }

    /**
     * <p>
     * The minor version of the environment template.
     * </p>
     * 
     * @param templateMinorVersion
     *        The minor version of the environment template.
     */

    public void setTemplateMinorVersion(String templateMinorVersion) {
        this.templateMinorVersion = templateMinorVersion;
    }

    /**
     * <p>
     * The minor version of the environment template.
     * </p>
     * 
     * @return The minor version of the environment template.
     */

    public String getTemplateMinorVersion() {
        return this.templateMinorVersion;
    }

    /**
     * <p>
     * The minor version of the environment template.
     * </p>
     * 
     * @param templateMinorVersion
     *        The minor version of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTemplateMinorVersion(String templateMinorVersion) {
        setTemplateMinorVersion(templateMinorVersion);
        return this;
    }

    /**
     * <p>
     * The name of the environment template. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Environment Templates</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param templateName
     *        The name of the environment template. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Environment Templates</a> in
     *        the <i>Proton User Guide</i>.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the environment template. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Environment Templates</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @return The name of the environment template. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Environment Templates</a> in
     *         the <i>Proton User Guide</i>.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the environment template. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Environment Templates</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param templateName
     *        The name of the environment template. For more information, see <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Environment Templates</a> in
     *        the <i>Proton User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCodebuildRoleArn() != null)
            sb.append("CodebuildRoleArn: ").append(getCodebuildRoleArn()).append(",");
        if (getComponentRoleArn() != null)
            sb.append("ComponentRoleArn: ").append(getComponentRoleArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getEnvironmentAccountConnectionId() != null)
            sb.append("EnvironmentAccountConnectionId: ").append(getEnvironmentAccountConnectionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProtonServiceRoleArn() != null)
            sb.append("ProtonServiceRoleArn: ").append(getProtonServiceRoleArn()).append(",");
        if (getProvisioningRepository() != null)
            sb.append("ProvisioningRepository: ").append(getProvisioningRepository()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateMajorVersion() != null)
            sb.append("TemplateMajorVersion: ").append(getTemplateMajorVersion()).append(",");
        if (getTemplateMinorVersion() != null)
            sb.append("TemplateMinorVersion: ").append(getTemplateMinorVersion()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;
        if (other.getCodebuildRoleArn() == null ^ this.getCodebuildRoleArn() == null)
            return false;
        if (other.getCodebuildRoleArn() != null && other.getCodebuildRoleArn().equals(this.getCodebuildRoleArn()) == false)
            return false;
        if (other.getComponentRoleArn() == null ^ this.getComponentRoleArn() == null)
            return false;
        if (other.getComponentRoleArn() != null && other.getComponentRoleArn().equals(this.getComponentRoleArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnvironmentAccountConnectionId() == null ^ this.getEnvironmentAccountConnectionId() == null)
            return false;
        if (other.getEnvironmentAccountConnectionId() != null
                && other.getEnvironmentAccountConnectionId().equals(this.getEnvironmentAccountConnectionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtonServiceRoleArn() == null ^ this.getProtonServiceRoleArn() == null)
            return false;
        if (other.getProtonServiceRoleArn() != null && other.getProtonServiceRoleArn().equals(this.getProtonServiceRoleArn()) == false)
            return false;
        if (other.getProvisioningRepository() == null ^ this.getProvisioningRepository() == null)
            return false;
        if (other.getProvisioningRepository() != null && other.getProvisioningRepository().equals(this.getProvisioningRepository()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateMajorVersion() == null ^ this.getTemplateMajorVersion() == null)
            return false;
        if (other.getTemplateMajorVersion() != null && other.getTemplateMajorVersion().equals(this.getTemplateMajorVersion()) == false)
            return false;
        if (other.getTemplateMinorVersion() == null ^ this.getTemplateMinorVersion() == null)
            return false;
        if (other.getTemplateMinorVersion() != null && other.getTemplateMinorVersion().equals(this.getTemplateMinorVersion()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodebuildRoleArn() == null) ? 0 : getCodebuildRoleArn().hashCode());
        hashCode = prime * hashCode + ((getComponentRoleArn() == null) ? 0 : getComponentRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentAccountConnectionId() == null) ? 0 : getEnvironmentAccountConnectionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtonServiceRoleArn() == null) ? 0 : getProtonServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getProvisioningRepository() == null) ? 0 : getProvisioningRepository().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentRequest clone() {
        return (CreateEnvironmentRequest) super.clone();
    }

}
