/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
            sb.append("Description: ").append(getDescription());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackupRequest clone() {
        return (CreateBackupRequest) super.clone();
    }

}
