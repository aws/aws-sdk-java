/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of settings that apply to users in a domain. These settings are specified when the
 * <code>CreateUserProfile</code> API is called, and as <code>DefaultUserSettings</code> when the
 * <code>CreateDomain</code> API is called.
 * </p>
 * <p>
 * <code>SecurityGroups</code> is aggregated when specified in both calls. For all other settings in
 * <code>UserSettings</code>, the values specified in <code>CreateUserProfile</code> take precedence over those
 * specified in <code>CreateDomain</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UserSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The execution role for the user.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for communication.
     * </p>
     * <p>
     * Optional when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to
     * <code>PublicInternetOnly</code>.
     * </p>
     * <p>
     * Required when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to <code>VpcOnly</code>, unless
     * specified as part of the <code>DefaultUserSettings</code> for the domain.
     * </p>
     * <p>
     * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio. Therefore, the number
     * of security groups that you can specify is one less than the maximum number shown.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * Specifies options for sharing Amazon SageMaker Studio notebooks.
     * </p>
     */
    private SharingSettings sharingSettings;
    /**
     * <p>
     * The Jupyter server's app settings.
     * </p>
     */
    private JupyterServerAppSettings jupyterServerAppSettings;
    /**
     * <p>
     * The kernel gateway app settings.
     * </p>
     */
    private KernelGatewayAppSettings kernelGatewayAppSettings;
    /**
     * <p>
     * The TensorBoard app settings.
     * </p>
     */
    private TensorBoardAppSettings tensorBoardAppSettings;
    /**
     * <p>
     * A collection of settings that configure user interaction with the <code>RStudioServerPro</code> app.
     * </p>
     */
    private RStudioServerProAppSettings rStudioServerProAppSettings;
    /**
     * <p>
     * A collection of settings that configure the <code>RSessionGateway</code> app.
     * </p>
     */
    private RSessionAppSettings rSessionAppSettings;
    /**
     * <p>
     * The Canvas app settings.
     * </p>
     */
    private CanvasAppSettings canvasAppSettings;
    /**
     * <p>
     * The Code Editor application settings.
     * </p>
     */
    private CodeEditorAppSettings codeEditorAppSettings;
    /**
     * <p>
     * The settings for the JupyterLab application.
     * </p>
     */
    private JupyterLabAppSettings jupyterLabAppSettings;
    /**
     * <p>
     * The storage settings for a space.
     * </p>
     */
    private DefaultSpaceStorageSettings spaceStorageSettings;
    /**
     * <p>
     * The default experience that the user is directed to when accessing the domain. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>studio::</code>: Indicates that Studio is the default experience. This value can only be passed if
     * <code>StudioWebPortal</code> is set to <code>ENABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>app:JupyterServer:</code>: Indicates that Studio Classic is the default experience.
     * </p>
     * </li>
     * </ul>
     */
    private String defaultLandingUri;
    /**
     * <p>
     * Whether the user can access Studio. If this value is set to <code>DISABLED</code>, the user cannot access Studio,
     * even if that is the default experience for the domain.
     * </p>
     */
    private String studioWebPortal;
    /**
     * <p>
     * Details about the POSIX identity that is used for file system operations.
     * </p>
     */
    private CustomPosixUserConfig customPosixUserConfig;
    /**
     * <p>
     * The settings for assigning a custom file system to a user profile. Permitted users can access this file system in
     * Amazon SageMaker Studio.
     * </p>
     */
    private java.util.List<CustomFileSystemConfig> customFileSystemConfigs;

    /**
     * <p>
     * The execution role for the user.
     * </p>
     * 
     * @param executionRole
     *        The execution role for the user.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The execution role for the user.
     * </p>
     * 
     * @return The execution role for the user.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The execution role for the user.
     * </p>
     * 
     * @param executionRole
     *        The execution role for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for communication.
     * </p>
     * <p>
     * Optional when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to
     * <code>PublicInternetOnly</code>.
     * </p>
     * <p>
     * Required when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to <code>VpcOnly</code>, unless
     * specified as part of the <code>DefaultUserSettings</code> for the domain.
     * </p>
     * <p>
     * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio. Therefore, the number
     * of security groups that you can specify is one less than the maximum number shown.
     * </p>
     * 
     * @return The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for
     *         communication.</p>
     *         <p>
     *         Optional when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to
     *         <code>PublicInternetOnly</code>.
     *         </p>
     *         <p>
     *         Required when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to <code>VpcOnly</code>
     *         , unless specified as part of the <code>DefaultUserSettings</code> for the domain.
     *         </p>
     *         <p>
     *         Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio. Therefore, the
     *         number of security groups that you can specify is one less than the maximum number shown.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for communication.
     * </p>
     * <p>
     * Optional when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to
     * <code>PublicInternetOnly</code>.
     * </p>
     * <p>
     * Required when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to <code>VpcOnly</code>, unless
     * specified as part of the <code>DefaultUserSettings</code> for the domain.
     * </p>
     * <p>
     * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio. Therefore, the number
     * of security groups that you can specify is one less than the maximum number shown.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for communication.</p>
     *        <p>
     *        Optional when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to
     *        <code>PublicInternetOnly</code>.
     *        </p>
     *        <p>
     *        Required when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to <code>VpcOnly</code>,
     *        unless specified as part of the <code>DefaultUserSettings</code> for the domain.
     *        </p>
     *        <p>
     *        Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio. Therefore, the
     *        number of security groups that you can specify is one less than the maximum number shown.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for communication.
     * </p>
     * <p>
     * Optional when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to
     * <code>PublicInternetOnly</code>.
     * </p>
     * <p>
     * Required when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to <code>VpcOnly</code>, unless
     * specified as part of the <code>DefaultUserSettings</code> for the domain.
     * </p>
     * <p>
     * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio. Therefore, the number
     * of security groups that you can specify is one less than the maximum number shown.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for communication.</p>
     *        <p>
     *        Optional when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to
     *        <code>PublicInternetOnly</code>.
     *        </p>
     *        <p>
     *        Required when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to <code>VpcOnly</code>,
     *        unless specified as part of the <code>DefaultUserSettings</code> for the domain.
     *        </p>
     *        <p>
     *        Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio. Therefore, the
     *        number of security groups that you can specify is one less than the maximum number shown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for communication.
     * </p>
     * <p>
     * Optional when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to
     * <code>PublicInternetOnly</code>.
     * </p>
     * <p>
     * Required when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to <code>VpcOnly</code>, unless
     * specified as part of the <code>DefaultUserSettings</code> for the domain.
     * </p>
     * <p>
     * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio. Therefore, the number
     * of security groups that you can specify is one less than the maximum number shown.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for communication.</p>
     *        <p>
     *        Optional when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to
     *        <code>PublicInternetOnly</code>.
     *        </p>
     *        <p>
     *        Required when the <code>CreateDomain.AppNetworkAccessType</code> parameter is set to <code>VpcOnly</code>,
     *        unless specified as part of the <code>DefaultUserSettings</code> for the domain.
     *        </p>
     *        <p>
     *        Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio. Therefore, the
     *        number of security groups that you can specify is one less than the maximum number shown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Specifies options for sharing Amazon SageMaker Studio notebooks.
     * </p>
     * 
     * @param sharingSettings
     *        Specifies options for sharing Amazon SageMaker Studio notebooks.
     */

    public void setSharingSettings(SharingSettings sharingSettings) {
        this.sharingSettings = sharingSettings;
    }

    /**
     * <p>
     * Specifies options for sharing Amazon SageMaker Studio notebooks.
     * </p>
     * 
     * @return Specifies options for sharing Amazon SageMaker Studio notebooks.
     */

    public SharingSettings getSharingSettings() {
        return this.sharingSettings;
    }

    /**
     * <p>
     * Specifies options for sharing Amazon SageMaker Studio notebooks.
     * </p>
     * 
     * @param sharingSettings
     *        Specifies options for sharing Amazon SageMaker Studio notebooks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withSharingSettings(SharingSettings sharingSettings) {
        setSharingSettings(sharingSettings);
        return this;
    }

    /**
     * <p>
     * The Jupyter server's app settings.
     * </p>
     * 
     * @param jupyterServerAppSettings
     *        The Jupyter server's app settings.
     */

    public void setJupyterServerAppSettings(JupyterServerAppSettings jupyterServerAppSettings) {
        this.jupyterServerAppSettings = jupyterServerAppSettings;
    }

    /**
     * <p>
     * The Jupyter server's app settings.
     * </p>
     * 
     * @return The Jupyter server's app settings.
     */

    public JupyterServerAppSettings getJupyterServerAppSettings() {
        return this.jupyterServerAppSettings;
    }

    /**
     * <p>
     * The Jupyter server's app settings.
     * </p>
     * 
     * @param jupyterServerAppSettings
     *        The Jupyter server's app settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withJupyterServerAppSettings(JupyterServerAppSettings jupyterServerAppSettings) {
        setJupyterServerAppSettings(jupyterServerAppSettings);
        return this;
    }

    /**
     * <p>
     * The kernel gateway app settings.
     * </p>
     * 
     * @param kernelGatewayAppSettings
     *        The kernel gateway app settings.
     */

    public void setKernelGatewayAppSettings(KernelGatewayAppSettings kernelGatewayAppSettings) {
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
    }

    /**
     * <p>
     * The kernel gateway app settings.
     * </p>
     * 
     * @return The kernel gateway app settings.
     */

    public KernelGatewayAppSettings getKernelGatewayAppSettings() {
        return this.kernelGatewayAppSettings;
    }

    /**
     * <p>
     * The kernel gateway app settings.
     * </p>
     * 
     * @param kernelGatewayAppSettings
     *        The kernel gateway app settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withKernelGatewayAppSettings(KernelGatewayAppSettings kernelGatewayAppSettings) {
        setKernelGatewayAppSettings(kernelGatewayAppSettings);
        return this;
    }

    /**
     * <p>
     * The TensorBoard app settings.
     * </p>
     * 
     * @param tensorBoardAppSettings
     *        The TensorBoard app settings.
     */

    public void setTensorBoardAppSettings(TensorBoardAppSettings tensorBoardAppSettings) {
        this.tensorBoardAppSettings = tensorBoardAppSettings;
    }

    /**
     * <p>
     * The TensorBoard app settings.
     * </p>
     * 
     * @return The TensorBoard app settings.
     */

    public TensorBoardAppSettings getTensorBoardAppSettings() {
        return this.tensorBoardAppSettings;
    }

    /**
     * <p>
     * The TensorBoard app settings.
     * </p>
     * 
     * @param tensorBoardAppSettings
     *        The TensorBoard app settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withTensorBoardAppSettings(TensorBoardAppSettings tensorBoardAppSettings) {
        setTensorBoardAppSettings(tensorBoardAppSettings);
        return this;
    }

    /**
     * <p>
     * A collection of settings that configure user interaction with the <code>RStudioServerPro</code> app.
     * </p>
     * 
     * @param rStudioServerProAppSettings
     *        A collection of settings that configure user interaction with the <code>RStudioServerPro</code> app.
     */

    public void setRStudioServerProAppSettings(RStudioServerProAppSettings rStudioServerProAppSettings) {
        this.rStudioServerProAppSettings = rStudioServerProAppSettings;
    }

    /**
     * <p>
     * A collection of settings that configure user interaction with the <code>RStudioServerPro</code> app.
     * </p>
     * 
     * @return A collection of settings that configure user interaction with the <code>RStudioServerPro</code> app.
     */

    public RStudioServerProAppSettings getRStudioServerProAppSettings() {
        return this.rStudioServerProAppSettings;
    }

    /**
     * <p>
     * A collection of settings that configure user interaction with the <code>RStudioServerPro</code> app.
     * </p>
     * 
     * @param rStudioServerProAppSettings
     *        A collection of settings that configure user interaction with the <code>RStudioServerPro</code> app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withRStudioServerProAppSettings(RStudioServerProAppSettings rStudioServerProAppSettings) {
        setRStudioServerProAppSettings(rStudioServerProAppSettings);
        return this;
    }

    /**
     * <p>
     * A collection of settings that configure the <code>RSessionGateway</code> app.
     * </p>
     * 
     * @param rSessionAppSettings
     *        A collection of settings that configure the <code>RSessionGateway</code> app.
     */

    public void setRSessionAppSettings(RSessionAppSettings rSessionAppSettings) {
        this.rSessionAppSettings = rSessionAppSettings;
    }

    /**
     * <p>
     * A collection of settings that configure the <code>RSessionGateway</code> app.
     * </p>
     * 
     * @return A collection of settings that configure the <code>RSessionGateway</code> app.
     */

    public RSessionAppSettings getRSessionAppSettings() {
        return this.rSessionAppSettings;
    }

    /**
     * <p>
     * A collection of settings that configure the <code>RSessionGateway</code> app.
     * </p>
     * 
     * @param rSessionAppSettings
     *        A collection of settings that configure the <code>RSessionGateway</code> app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withRSessionAppSettings(RSessionAppSettings rSessionAppSettings) {
        setRSessionAppSettings(rSessionAppSettings);
        return this;
    }

    /**
     * <p>
     * The Canvas app settings.
     * </p>
     * 
     * @param canvasAppSettings
     *        The Canvas app settings.
     */

    public void setCanvasAppSettings(CanvasAppSettings canvasAppSettings) {
        this.canvasAppSettings = canvasAppSettings;
    }

    /**
     * <p>
     * The Canvas app settings.
     * </p>
     * 
     * @return The Canvas app settings.
     */

    public CanvasAppSettings getCanvasAppSettings() {
        return this.canvasAppSettings;
    }

    /**
     * <p>
     * The Canvas app settings.
     * </p>
     * 
     * @param canvasAppSettings
     *        The Canvas app settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withCanvasAppSettings(CanvasAppSettings canvasAppSettings) {
        setCanvasAppSettings(canvasAppSettings);
        return this;
    }

    /**
     * <p>
     * The Code Editor application settings.
     * </p>
     * 
     * @param codeEditorAppSettings
     *        The Code Editor application settings.
     */

    public void setCodeEditorAppSettings(CodeEditorAppSettings codeEditorAppSettings) {
        this.codeEditorAppSettings = codeEditorAppSettings;
    }

    /**
     * <p>
     * The Code Editor application settings.
     * </p>
     * 
     * @return The Code Editor application settings.
     */

    public CodeEditorAppSettings getCodeEditorAppSettings() {
        return this.codeEditorAppSettings;
    }

    /**
     * <p>
     * The Code Editor application settings.
     * </p>
     * 
     * @param codeEditorAppSettings
     *        The Code Editor application settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withCodeEditorAppSettings(CodeEditorAppSettings codeEditorAppSettings) {
        setCodeEditorAppSettings(codeEditorAppSettings);
        return this;
    }

    /**
     * <p>
     * The settings for the JupyterLab application.
     * </p>
     * 
     * @param jupyterLabAppSettings
     *        The settings for the JupyterLab application.
     */

    public void setJupyterLabAppSettings(JupyterLabAppSettings jupyterLabAppSettings) {
        this.jupyterLabAppSettings = jupyterLabAppSettings;
    }

    /**
     * <p>
     * The settings for the JupyterLab application.
     * </p>
     * 
     * @return The settings for the JupyterLab application.
     */

    public JupyterLabAppSettings getJupyterLabAppSettings() {
        return this.jupyterLabAppSettings;
    }

    /**
     * <p>
     * The settings for the JupyterLab application.
     * </p>
     * 
     * @param jupyterLabAppSettings
     *        The settings for the JupyterLab application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withJupyterLabAppSettings(JupyterLabAppSettings jupyterLabAppSettings) {
        setJupyterLabAppSettings(jupyterLabAppSettings);
        return this;
    }

    /**
     * <p>
     * The storage settings for a space.
     * </p>
     * 
     * @param spaceStorageSettings
     *        The storage settings for a space.
     */

    public void setSpaceStorageSettings(DefaultSpaceStorageSettings spaceStorageSettings) {
        this.spaceStorageSettings = spaceStorageSettings;
    }

    /**
     * <p>
     * The storage settings for a space.
     * </p>
     * 
     * @return The storage settings for a space.
     */

    public DefaultSpaceStorageSettings getSpaceStorageSettings() {
        return this.spaceStorageSettings;
    }

    /**
     * <p>
     * The storage settings for a space.
     * </p>
     * 
     * @param spaceStorageSettings
     *        The storage settings for a space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withSpaceStorageSettings(DefaultSpaceStorageSettings spaceStorageSettings) {
        setSpaceStorageSettings(spaceStorageSettings);
        return this;
    }

    /**
     * <p>
     * The default experience that the user is directed to when accessing the domain. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>studio::</code>: Indicates that Studio is the default experience. This value can only be passed if
     * <code>StudioWebPortal</code> is set to <code>ENABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>app:JupyterServer:</code>: Indicates that Studio Classic is the default experience.
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultLandingUri
     *        The default experience that the user is directed to when accessing the domain. The supported values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>studio::</code>: Indicates that Studio is the default experience. This value can only be passed if
     *        <code>StudioWebPortal</code> is set to <code>ENABLED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>app:JupyterServer:</code>: Indicates that Studio Classic is the default experience.
     *        </p>
     *        </li>
     */

    public void setDefaultLandingUri(String defaultLandingUri) {
        this.defaultLandingUri = defaultLandingUri;
    }

    /**
     * <p>
     * The default experience that the user is directed to when accessing the domain. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>studio::</code>: Indicates that Studio is the default experience. This value can only be passed if
     * <code>StudioWebPortal</code> is set to <code>ENABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>app:JupyterServer:</code>: Indicates that Studio Classic is the default experience.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The default experience that the user is directed to when accessing the domain. The supported values
     *         are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>studio::</code>: Indicates that Studio is the default experience. This value can only be passed if
     *         <code>StudioWebPortal</code> is set to <code>ENABLED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>app:JupyterServer:</code>: Indicates that Studio Classic is the default experience.
     *         </p>
     *         </li>
     */

    public String getDefaultLandingUri() {
        return this.defaultLandingUri;
    }

    /**
     * <p>
     * The default experience that the user is directed to when accessing the domain. The supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>studio::</code>: Indicates that Studio is the default experience. This value can only be passed if
     * <code>StudioWebPortal</code> is set to <code>ENABLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>app:JupyterServer:</code>: Indicates that Studio Classic is the default experience.
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultLandingUri
     *        The default experience that the user is directed to when accessing the domain. The supported values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>studio::</code>: Indicates that Studio is the default experience. This value can only be passed if
     *        <code>StudioWebPortal</code> is set to <code>ENABLED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>app:JupyterServer:</code>: Indicates that Studio Classic is the default experience.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withDefaultLandingUri(String defaultLandingUri) {
        setDefaultLandingUri(defaultLandingUri);
        return this;
    }

    /**
     * <p>
     * Whether the user can access Studio. If this value is set to <code>DISABLED</code>, the user cannot access Studio,
     * even if that is the default experience for the domain.
     * </p>
     * 
     * @param studioWebPortal
     *        Whether the user can access Studio. If this value is set to <code>DISABLED</code>, the user cannot access
     *        Studio, even if that is the default experience for the domain.
     * @see StudioWebPortal
     */

    public void setStudioWebPortal(String studioWebPortal) {
        this.studioWebPortal = studioWebPortal;
    }

    /**
     * <p>
     * Whether the user can access Studio. If this value is set to <code>DISABLED</code>, the user cannot access Studio,
     * even if that is the default experience for the domain.
     * </p>
     * 
     * @return Whether the user can access Studio. If this value is set to <code>DISABLED</code>, the user cannot access
     *         Studio, even if that is the default experience for the domain.
     * @see StudioWebPortal
     */

    public String getStudioWebPortal() {
        return this.studioWebPortal;
    }

    /**
     * <p>
     * Whether the user can access Studio. If this value is set to <code>DISABLED</code>, the user cannot access Studio,
     * even if that is the default experience for the domain.
     * </p>
     * 
     * @param studioWebPortal
     *        Whether the user can access Studio. If this value is set to <code>DISABLED</code>, the user cannot access
     *        Studio, even if that is the default experience for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioWebPortal
     */

    public UserSettings withStudioWebPortal(String studioWebPortal) {
        setStudioWebPortal(studioWebPortal);
        return this;
    }

    /**
     * <p>
     * Whether the user can access Studio. If this value is set to <code>DISABLED</code>, the user cannot access Studio,
     * even if that is the default experience for the domain.
     * </p>
     * 
     * @param studioWebPortal
     *        Whether the user can access Studio. If this value is set to <code>DISABLED</code>, the user cannot access
     *        Studio, even if that is the default experience for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioWebPortal
     */

    public UserSettings withStudioWebPortal(StudioWebPortal studioWebPortal) {
        this.studioWebPortal = studioWebPortal.toString();
        return this;
    }

    /**
     * <p>
     * Details about the POSIX identity that is used for file system operations.
     * </p>
     * 
     * @param customPosixUserConfig
     *        Details about the POSIX identity that is used for file system operations.
     */

    public void setCustomPosixUserConfig(CustomPosixUserConfig customPosixUserConfig) {
        this.customPosixUserConfig = customPosixUserConfig;
    }

    /**
     * <p>
     * Details about the POSIX identity that is used for file system operations.
     * </p>
     * 
     * @return Details about the POSIX identity that is used for file system operations.
     */

    public CustomPosixUserConfig getCustomPosixUserConfig() {
        return this.customPosixUserConfig;
    }

    /**
     * <p>
     * Details about the POSIX identity that is used for file system operations.
     * </p>
     * 
     * @param customPosixUserConfig
     *        Details about the POSIX identity that is used for file system operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withCustomPosixUserConfig(CustomPosixUserConfig customPosixUserConfig) {
        setCustomPosixUserConfig(customPosixUserConfig);
        return this;
    }

    /**
     * <p>
     * The settings for assigning a custom file system to a user profile. Permitted users can access this file system in
     * Amazon SageMaker Studio.
     * </p>
     * 
     * @return The settings for assigning a custom file system to a user profile. Permitted users can access this file
     *         system in Amazon SageMaker Studio.
     */

    public java.util.List<CustomFileSystemConfig> getCustomFileSystemConfigs() {
        return customFileSystemConfigs;
    }

    /**
     * <p>
     * The settings for assigning a custom file system to a user profile. Permitted users can access this file system in
     * Amazon SageMaker Studio.
     * </p>
     * 
     * @param customFileSystemConfigs
     *        The settings for assigning a custom file system to a user profile. Permitted users can access this file
     *        system in Amazon SageMaker Studio.
     */

    public void setCustomFileSystemConfigs(java.util.Collection<CustomFileSystemConfig> customFileSystemConfigs) {
        if (customFileSystemConfigs == null) {
            this.customFileSystemConfigs = null;
            return;
        }

        this.customFileSystemConfigs = new java.util.ArrayList<CustomFileSystemConfig>(customFileSystemConfigs);
    }

    /**
     * <p>
     * The settings for assigning a custom file system to a user profile. Permitted users can access this file system in
     * Amazon SageMaker Studio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomFileSystemConfigs(java.util.Collection)} or
     * {@link #withCustomFileSystemConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customFileSystemConfigs
     *        The settings for assigning a custom file system to a user profile. Permitted users can access this file
     *        system in Amazon SageMaker Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withCustomFileSystemConfigs(CustomFileSystemConfig... customFileSystemConfigs) {
        if (this.customFileSystemConfigs == null) {
            setCustomFileSystemConfigs(new java.util.ArrayList<CustomFileSystemConfig>(customFileSystemConfigs.length));
        }
        for (CustomFileSystemConfig ele : customFileSystemConfigs) {
            this.customFileSystemConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The settings for assigning a custom file system to a user profile. Permitted users can access this file system in
     * Amazon SageMaker Studio.
     * </p>
     * 
     * @param customFileSystemConfigs
     *        The settings for assigning a custom file system to a user profile. Permitted users can access this file
     *        system in Amazon SageMaker Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSettings withCustomFileSystemConfigs(java.util.Collection<CustomFileSystemConfig> customFileSystemConfigs) {
        setCustomFileSystemConfigs(customFileSystemConfigs);
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
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSharingSettings() != null)
            sb.append("SharingSettings: ").append(getSharingSettings()).append(",");
        if (getJupyterServerAppSettings() != null)
            sb.append("JupyterServerAppSettings: ").append(getJupyterServerAppSettings()).append(",");
        if (getKernelGatewayAppSettings() != null)
            sb.append("KernelGatewayAppSettings: ").append(getKernelGatewayAppSettings()).append(",");
        if (getTensorBoardAppSettings() != null)
            sb.append("TensorBoardAppSettings: ").append(getTensorBoardAppSettings()).append(",");
        if (getRStudioServerProAppSettings() != null)
            sb.append("RStudioServerProAppSettings: ").append(getRStudioServerProAppSettings()).append(",");
        if (getRSessionAppSettings() != null)
            sb.append("RSessionAppSettings: ").append(getRSessionAppSettings()).append(",");
        if (getCanvasAppSettings() != null)
            sb.append("CanvasAppSettings: ").append(getCanvasAppSettings()).append(",");
        if (getCodeEditorAppSettings() != null)
            sb.append("CodeEditorAppSettings: ").append(getCodeEditorAppSettings()).append(",");
        if (getJupyterLabAppSettings() != null)
            sb.append("JupyterLabAppSettings: ").append(getJupyterLabAppSettings()).append(",");
        if (getSpaceStorageSettings() != null)
            sb.append("SpaceStorageSettings: ").append(getSpaceStorageSettings()).append(",");
        if (getDefaultLandingUri() != null)
            sb.append("DefaultLandingUri: ").append(getDefaultLandingUri()).append(",");
        if (getStudioWebPortal() != null)
            sb.append("StudioWebPortal: ").append(getStudioWebPortal()).append(",");
        if (getCustomPosixUserConfig() != null)
            sb.append("CustomPosixUserConfig: ").append(getCustomPosixUserConfig()).append(",");
        if (getCustomFileSystemConfigs() != null)
            sb.append("CustomFileSystemConfigs: ").append(getCustomFileSystemConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserSettings == false)
            return false;
        UserSettings other = (UserSettings) obj;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSharingSettings() == null ^ this.getSharingSettings() == null)
            return false;
        if (other.getSharingSettings() != null && other.getSharingSettings().equals(this.getSharingSettings()) == false)
            return false;
        if (other.getJupyterServerAppSettings() == null ^ this.getJupyterServerAppSettings() == null)
            return false;
        if (other.getJupyterServerAppSettings() != null && other.getJupyterServerAppSettings().equals(this.getJupyterServerAppSettings()) == false)
            return false;
        if (other.getKernelGatewayAppSettings() == null ^ this.getKernelGatewayAppSettings() == null)
            return false;
        if (other.getKernelGatewayAppSettings() != null && other.getKernelGatewayAppSettings().equals(this.getKernelGatewayAppSettings()) == false)
            return false;
        if (other.getTensorBoardAppSettings() == null ^ this.getTensorBoardAppSettings() == null)
            return false;
        if (other.getTensorBoardAppSettings() != null && other.getTensorBoardAppSettings().equals(this.getTensorBoardAppSettings()) == false)
            return false;
        if (other.getRStudioServerProAppSettings() == null ^ this.getRStudioServerProAppSettings() == null)
            return false;
        if (other.getRStudioServerProAppSettings() != null && other.getRStudioServerProAppSettings().equals(this.getRStudioServerProAppSettings()) == false)
            return false;
        if (other.getRSessionAppSettings() == null ^ this.getRSessionAppSettings() == null)
            return false;
        if (other.getRSessionAppSettings() != null && other.getRSessionAppSettings().equals(this.getRSessionAppSettings()) == false)
            return false;
        if (other.getCanvasAppSettings() == null ^ this.getCanvasAppSettings() == null)
            return false;
        if (other.getCanvasAppSettings() != null && other.getCanvasAppSettings().equals(this.getCanvasAppSettings()) == false)
            return false;
        if (other.getCodeEditorAppSettings() == null ^ this.getCodeEditorAppSettings() == null)
            return false;
        if (other.getCodeEditorAppSettings() != null && other.getCodeEditorAppSettings().equals(this.getCodeEditorAppSettings()) == false)
            return false;
        if (other.getJupyterLabAppSettings() == null ^ this.getJupyterLabAppSettings() == null)
            return false;
        if (other.getJupyterLabAppSettings() != null && other.getJupyterLabAppSettings().equals(this.getJupyterLabAppSettings()) == false)
            return false;
        if (other.getSpaceStorageSettings() == null ^ this.getSpaceStorageSettings() == null)
            return false;
        if (other.getSpaceStorageSettings() != null && other.getSpaceStorageSettings().equals(this.getSpaceStorageSettings()) == false)
            return false;
        if (other.getDefaultLandingUri() == null ^ this.getDefaultLandingUri() == null)
            return false;
        if (other.getDefaultLandingUri() != null && other.getDefaultLandingUri().equals(this.getDefaultLandingUri()) == false)
            return false;
        if (other.getStudioWebPortal() == null ^ this.getStudioWebPortal() == null)
            return false;
        if (other.getStudioWebPortal() != null && other.getStudioWebPortal().equals(this.getStudioWebPortal()) == false)
            return false;
        if (other.getCustomPosixUserConfig() == null ^ this.getCustomPosixUserConfig() == null)
            return false;
        if (other.getCustomPosixUserConfig() != null && other.getCustomPosixUserConfig().equals(this.getCustomPosixUserConfig()) == false)
            return false;
        if (other.getCustomFileSystemConfigs() == null ^ this.getCustomFileSystemConfigs() == null)
            return false;
        if (other.getCustomFileSystemConfigs() != null && other.getCustomFileSystemConfigs().equals(this.getCustomFileSystemConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSharingSettings() == null) ? 0 : getSharingSettings().hashCode());
        hashCode = prime * hashCode + ((getJupyterServerAppSettings() == null) ? 0 : getJupyterServerAppSettings().hashCode());
        hashCode = prime * hashCode + ((getKernelGatewayAppSettings() == null) ? 0 : getKernelGatewayAppSettings().hashCode());
        hashCode = prime * hashCode + ((getTensorBoardAppSettings() == null) ? 0 : getTensorBoardAppSettings().hashCode());
        hashCode = prime * hashCode + ((getRStudioServerProAppSettings() == null) ? 0 : getRStudioServerProAppSettings().hashCode());
        hashCode = prime * hashCode + ((getRSessionAppSettings() == null) ? 0 : getRSessionAppSettings().hashCode());
        hashCode = prime * hashCode + ((getCanvasAppSettings() == null) ? 0 : getCanvasAppSettings().hashCode());
        hashCode = prime * hashCode + ((getCodeEditorAppSettings() == null) ? 0 : getCodeEditorAppSettings().hashCode());
        hashCode = prime * hashCode + ((getJupyterLabAppSettings() == null) ? 0 : getJupyterLabAppSettings().hashCode());
        hashCode = prime * hashCode + ((getSpaceStorageSettings() == null) ? 0 : getSpaceStorageSettings().hashCode());
        hashCode = prime * hashCode + ((getDefaultLandingUri() == null) ? 0 : getDefaultLandingUri().hashCode());
        hashCode = prime * hashCode + ((getStudioWebPortal() == null) ? 0 : getStudioWebPortal().hashCode());
        hashCode = prime * hashCode + ((getCustomPosixUserConfig() == null) ? 0 : getCustomPosixUserConfig().hashCode());
        hashCode = prime * hashCode + ((getCustomFileSystemConfigs() == null) ? 0 : getCustomFileSystemConfigs().hashCode());
        return hashCode;
    }

    @Override
    public UserSettings clone() {
        try {
            return (UserSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.UserSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
