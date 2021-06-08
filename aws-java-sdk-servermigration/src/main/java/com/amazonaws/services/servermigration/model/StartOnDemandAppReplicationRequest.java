/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/StartOnDemandAppReplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartOnDemandAppReplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The description of the replication run.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param appId
     *        The ID of the application.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param appId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOnDemandAppReplicationRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The description of the replication run.
     * </p>
     * 
     * @param description
     *        The description of the replication run.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the replication run.
     * </p>
     * 
     * @return The description of the replication run.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the replication run.
     * </p>
     * 
     * @param description
     *        The description of the replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOnDemandAppReplicationRequest withDescription(String description) {
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
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

        if (obj instanceof StartOnDemandAppReplicationRequest == false)
            return false;
        StartOnDemandAppReplicationRequest other = (StartOnDemandAppReplicationRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
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

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public StartOnDemandAppReplicationRequest clone() {
        return (StartOnDemandAppReplicationRequest) super.clone();
    }

}
