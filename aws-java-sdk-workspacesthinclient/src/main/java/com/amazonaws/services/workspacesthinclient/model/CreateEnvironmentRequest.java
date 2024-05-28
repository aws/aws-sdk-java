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
package com.amazonaws.services.workspacesthinclient.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/CreateEnvironment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or AppStream 2.0.
     * </p>
     */
    private String desktopArn;
    /**
     * <p>
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     * </p>
     */
    private String desktopEndpoint;
    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     */
    private String softwareSetUpdateSchedule;
    /**
     * <p>
     * A specification for a time window to apply software updates.
     * </p>
     */
    private MaintenanceWindow maintenanceWindow;
    /**
     * <p>
     * An option to define which software updates to apply.
     * </p>
     */
    private String softwareSetUpdateMode;
    /**
     * <p>
     * The ID of the software set to apply.
     * </p>
     */
    private String desiredSoftwareSetId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service key to use to encrypt the environment.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name for the environment.
     * </p>
     * 
     * @param name
     *        The name for the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the environment.
     * </p>
     * 
     * @return The name for the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the environment.
     * </p>
     * 
     * @param name
     *        The name for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or AppStream 2.0.
     * </p>
     * 
     * @param desktopArn
     *        The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or
     *        AppStream 2.0.
     */

    public void setDesktopArn(String desktopArn) {
        this.desktopArn = desktopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or AppStream 2.0.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or
     *         AppStream 2.0.
     */

    public String getDesktopArn() {
        return this.desktopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or AppStream 2.0.
     * </p>
     * 
     * @param desktopArn
     *        The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or
     *        AppStream 2.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDesktopArn(String desktopArn) {
        setDesktopArn(desktopArn);
        return this;
    }

    /**
     * <p>
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     * </p>
     * 
     * @param desktopEndpoint
     *        The URL for the identity provider login (only for environments that use AppStream 2.0).
     */

    public void setDesktopEndpoint(String desktopEndpoint) {
        this.desktopEndpoint = desktopEndpoint;
    }

    /**
     * <p>
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     * </p>
     * 
     * @return The URL for the identity provider login (only for environments that use AppStream 2.0).
     */

    public String getDesktopEndpoint() {
        return this.desktopEndpoint;
    }

    /**
     * <p>
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     * </p>
     * 
     * @param desktopEndpoint
     *        The URL for the identity provider login (only for environments that use AppStream 2.0).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDesktopEndpoint(String desktopEndpoint) {
        setDesktopEndpoint(desktopEndpoint);
        return this;
    }

    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     * 
     * @param softwareSetUpdateSchedule
     *        An option to define if software updates should be applied within a maintenance window.
     * @see SoftwareSetUpdateSchedule
     */

    public void setSoftwareSetUpdateSchedule(String softwareSetUpdateSchedule) {
        this.softwareSetUpdateSchedule = softwareSetUpdateSchedule;
    }

    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     * 
     * @return An option to define if software updates should be applied within a maintenance window.
     * @see SoftwareSetUpdateSchedule
     */

    public String getSoftwareSetUpdateSchedule() {
        return this.softwareSetUpdateSchedule;
    }

    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     * 
     * @param softwareSetUpdateSchedule
     *        An option to define if software updates should be applied within a maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareSetUpdateSchedule
     */

    public CreateEnvironmentRequest withSoftwareSetUpdateSchedule(String softwareSetUpdateSchedule) {
        setSoftwareSetUpdateSchedule(softwareSetUpdateSchedule);
        return this;
    }

    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     * 
     * @param softwareSetUpdateSchedule
     *        An option to define if software updates should be applied within a maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareSetUpdateSchedule
     */

    public CreateEnvironmentRequest withSoftwareSetUpdateSchedule(SoftwareSetUpdateSchedule softwareSetUpdateSchedule) {
        this.softwareSetUpdateSchedule = softwareSetUpdateSchedule.toString();
        return this;
    }

    /**
     * <p>
     * A specification for a time window to apply software updates.
     * </p>
     * 
     * @param maintenanceWindow
     *        A specification for a time window to apply software updates.
     */

    public void setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    /**
     * <p>
     * A specification for a time window to apply software updates.
     * </p>
     * 
     * @return A specification for a time window to apply software updates.
     */

    public MaintenanceWindow getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * <p>
     * A specification for a time window to apply software updates.
     * </p>
     * 
     * @param maintenanceWindow
     *        A specification for a time window to apply software updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        setMaintenanceWindow(maintenanceWindow);
        return this;
    }

    /**
     * <p>
     * An option to define which software updates to apply.
     * </p>
     * 
     * @param softwareSetUpdateMode
     *        An option to define which software updates to apply.
     * @see SoftwareSetUpdateMode
     */

    public void setSoftwareSetUpdateMode(String softwareSetUpdateMode) {
        this.softwareSetUpdateMode = softwareSetUpdateMode;
    }

    /**
     * <p>
     * An option to define which software updates to apply.
     * </p>
     * 
     * @return An option to define which software updates to apply.
     * @see SoftwareSetUpdateMode
     */

    public String getSoftwareSetUpdateMode() {
        return this.softwareSetUpdateMode;
    }

    /**
     * <p>
     * An option to define which software updates to apply.
     * </p>
     * 
     * @param softwareSetUpdateMode
     *        An option to define which software updates to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareSetUpdateMode
     */

    public CreateEnvironmentRequest withSoftwareSetUpdateMode(String softwareSetUpdateMode) {
        setSoftwareSetUpdateMode(softwareSetUpdateMode);
        return this;
    }

    /**
     * <p>
     * An option to define which software updates to apply.
     * </p>
     * 
     * @param softwareSetUpdateMode
     *        An option to define which software updates to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareSetUpdateMode
     */

    public CreateEnvironmentRequest withSoftwareSetUpdateMode(SoftwareSetUpdateMode softwareSetUpdateMode) {
        this.softwareSetUpdateMode = softwareSetUpdateMode.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the software set to apply.
     * </p>
     * 
     * @param desiredSoftwareSetId
     *        The ID of the software set to apply.
     */

    public void setDesiredSoftwareSetId(String desiredSoftwareSetId) {
        this.desiredSoftwareSetId = desiredSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set to apply.
     * </p>
     * 
     * @return The ID of the software set to apply.
     */

    public String getDesiredSoftwareSetId() {
        return this.desiredSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set to apply.
     * </p>
     * 
     * @param desiredSoftwareSetId
     *        The ID of the software set to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDesiredSoftwareSetId(String desiredSoftwareSetId) {
        setDesiredSoftwareSetId(desiredSoftwareSetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service key to use to encrypt the environment.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the Key Management Service key to use to encrypt the environment.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service key to use to encrypt the environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Key Management Service key to use to encrypt the environment.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service key to use to encrypt the environment.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the Key Management Service key to use to encrypt the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @return Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *         This lets you safely retry the request without accidentally performing the same operation a second time.
     *         Passing the same value to a later call to an operation requires that you also pass the same value for all
     *         other parameters. We recommend that you use a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.</p>
     *         <p>
     *         If you don't provide this value, then Amazon Web Services generates a random one for you.
     *         </p>
     *         <p>
     *         If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *         retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * 
     * @return A map of the key-value pairs of the tag or tags to assign to the resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs of the tag or tags to assign to the resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs of the tag or tags to assign to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEnvironmentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDesktopArn() != null)
            sb.append("DesktopArn: ").append(getDesktopArn()).append(",");
        if (getDesktopEndpoint() != null)
            sb.append("DesktopEndpoint: ").append("***Sensitive Data Redacted***").append(",");
        if (getSoftwareSetUpdateSchedule() != null)
            sb.append("SoftwareSetUpdateSchedule: ").append(getSoftwareSetUpdateSchedule()).append(",");
        if (getMaintenanceWindow() != null)
            sb.append("MaintenanceWindow: ").append(getMaintenanceWindow()).append(",");
        if (getSoftwareSetUpdateMode() != null)
            sb.append("SoftwareSetUpdateMode: ").append(getSoftwareSetUpdateMode()).append(",");
        if (getDesiredSoftwareSetId() != null)
            sb.append("DesiredSoftwareSetId: ").append(getDesiredSoftwareSetId()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDesktopArn() == null ^ this.getDesktopArn() == null)
            return false;
        if (other.getDesktopArn() != null && other.getDesktopArn().equals(this.getDesktopArn()) == false)
            return false;
        if (other.getDesktopEndpoint() == null ^ this.getDesktopEndpoint() == null)
            return false;
        if (other.getDesktopEndpoint() != null && other.getDesktopEndpoint().equals(this.getDesktopEndpoint()) == false)
            return false;
        if (other.getSoftwareSetUpdateSchedule() == null ^ this.getSoftwareSetUpdateSchedule() == null)
            return false;
        if (other.getSoftwareSetUpdateSchedule() != null && other.getSoftwareSetUpdateSchedule().equals(this.getSoftwareSetUpdateSchedule()) == false)
            return false;
        if (other.getMaintenanceWindow() == null ^ this.getMaintenanceWindow() == null)
            return false;
        if (other.getMaintenanceWindow() != null && other.getMaintenanceWindow().equals(this.getMaintenanceWindow()) == false)
            return false;
        if (other.getSoftwareSetUpdateMode() == null ^ this.getSoftwareSetUpdateMode() == null)
            return false;
        if (other.getSoftwareSetUpdateMode() != null && other.getSoftwareSetUpdateMode().equals(this.getSoftwareSetUpdateMode()) == false)
            return false;
        if (other.getDesiredSoftwareSetId() == null ^ this.getDesiredSoftwareSetId() == null)
            return false;
        if (other.getDesiredSoftwareSetId() != null && other.getDesiredSoftwareSetId().equals(this.getDesiredSoftwareSetId()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDesktopArn() == null) ? 0 : getDesktopArn().hashCode());
        hashCode = prime * hashCode + ((getDesktopEndpoint() == null) ? 0 : getDesktopEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSoftwareSetUpdateSchedule() == null) ? 0 : getSoftwareSetUpdateSchedule().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindow() == null) ? 0 : getMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getSoftwareSetUpdateMode() == null) ? 0 : getSoftwareSetUpdateMode().hashCode());
        hashCode = prime * hashCode + ((getDesiredSoftwareSetId() == null) ? 0 : getDesiredSoftwareSetId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentRequest clone() {
        return (CreateEnvironmentRequest) super.clone();
    }

}
