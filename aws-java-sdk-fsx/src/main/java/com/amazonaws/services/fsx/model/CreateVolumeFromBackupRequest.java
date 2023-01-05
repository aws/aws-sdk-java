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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolumeFromBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVolumeFromBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String backupId;

    private String clientRequestToken;
    /**
     * <p>
     * The name of the new volume you're creating.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the configuration of the ONTAP volume that you are creating.
     * </p>
     */
    private CreateOntapVolumeConfiguration ontapConfiguration;

    private java.util.List<Tag> tags;

    /**
     * @param backupId
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * @return
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @param backupId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeFromBackupRequest withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeFromBackupRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The name of the new volume you're creating.
     * </p>
     * 
     * @param name
     *        The name of the new volume you're creating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new volume you're creating.
     * </p>
     * 
     * @return The name of the new volume you're creating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new volume you're creating.
     * </p>
     * 
     * @param name
     *        The name of the new volume you're creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeFromBackupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration of the ONTAP volume that you are creating.
     * </p>
     * 
     * @param ontapConfiguration
     *        Specifies the configuration of the ONTAP volume that you are creating.
     */

    public void setOntapConfiguration(CreateOntapVolumeConfiguration ontapConfiguration) {
        this.ontapConfiguration = ontapConfiguration;
    }

    /**
     * <p>
     * Specifies the configuration of the ONTAP volume that you are creating.
     * </p>
     * 
     * @return Specifies the configuration of the ONTAP volume that you are creating.
     */

    public CreateOntapVolumeConfiguration getOntapConfiguration() {
        return this.ontapConfiguration;
    }

    /**
     * <p>
     * Specifies the configuration of the ONTAP volume that you are creating.
     * </p>
     * 
     * @param ontapConfiguration
     *        Specifies the configuration of the ONTAP volume that you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeFromBackupRequest withOntapConfiguration(CreateOntapVolumeConfiguration ontapConfiguration) {
        setOntapConfiguration(ontapConfiguration);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeFromBackupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeFromBackupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOntapConfiguration() != null)
            sb.append("OntapConfiguration: ").append(getOntapConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVolumeFromBackupRequest == false)
            return false;
        CreateVolumeFromBackupRequest other = (CreateVolumeFromBackupRequest) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOntapConfiguration() == null ^ this.getOntapConfiguration() == null)
            return false;
        if (other.getOntapConfiguration() != null && other.getOntapConfiguration().equals(this.getOntapConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOntapConfiguration() == null) ? 0 : getOntapConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVolumeFromBackupRequest clone() {
        return (CreateVolumeFromBackupRequest) super.clone();
    }

}
