/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/CreateBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the server that you want to back up.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * A user-defined description of the backup.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the server that you want to back up.
     * </p>
     * 
     * @param serverName
     *        The name of the server that you want to back up.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server that you want to back up.
     * </p>
     * 
     * @return The name of the server that you want to back up.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server that you want to back up.
     * </p>
     * 
     * @param serverName
     *        The name of the server that you want to back up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * A user-defined description of the backup.
     * </p>
     * 
     * @param description
     *        A user-defined description of the backup.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-defined description of the backup.
     * </p>
     * 
     * @return A user-defined description of the backup.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-defined description of the backup.
     * </p>
     * 
     * @param description
     *        A user-defined description of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key cannot be empty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators,
     *         or the following special characters: <code>+ - = . _ : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or
     *         the following special characters: <code>+ - = . _ : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Leading and trailing white spaces are trimmed from both the key and value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The key cannot be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators,
     *        or the following special characters: <code>+ - = . _ : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or
     *        the following special characters: <code>+ - = . _ : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Leading and trailing white spaces are trimmed from both the key and value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
     *        </p>
     *        </li>
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
     * A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The key cannot be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators,
     *        or the following special characters: <code>+ - = . _ : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or
     *        the following special characters: <code>+ - = . _ : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Leading and trailing white spaces are trimmed from both the key and value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupRequest withTags(Tag... tags) {
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
     * A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key cannot be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the
     * following special characters: <code>+ - = . _ : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Leading and trailing white spaces are trimmed from both the key and value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The key cannot be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators,
     *        or the following special characters: <code>+ - = . _ : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or
     *        the following special characters: <code>+ - = . _ : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Leading and trailing white spaces are trimmed from both the key and value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateBackupRequest == false)
            return false;
        CreateBackupRequest other = (CreateBackupRequest) obj;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackupRequest clone() {
        return (CreateBackupRequest) super.clone();
    }

}
