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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/StartJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartJobRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This output displays the started job run ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * This output displays the name of the started job run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * This output lists the ARN of job run.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * This output displays the virtual cluster ID for which the job run was submitted.
     * </p>
     */
    private String virtualClusterId;

    /**
     * <p>
     * This output displays the started job run ID.
     * </p>
     * 
     * @param id
     *        This output displays the started job run ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * This output displays the started job run ID.
     * </p>
     * 
     * @return This output displays the started job run ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * This output displays the started job run ID.
     * </p>
     * 
     * @param id
     *        This output displays the started job run ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * This output displays the name of the started job run.
     * </p>
     * 
     * @param name
     *        This output displays the name of the started job run.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * This output displays the name of the started job run.
     * </p>
     * 
     * @return This output displays the name of the started job run.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * This output displays the name of the started job run.
     * </p>
     * 
     * @param name
     *        This output displays the name of the started job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * This output lists the ARN of job run.
     * </p>
     * 
     * @param arn
     *        This output lists the ARN of job run.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * This output lists the ARN of job run.
     * </p>
     * 
     * @return This output lists the ARN of job run.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * This output lists the ARN of job run.
     * </p>
     * 
     * @param arn
     *        This output lists the ARN of job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * This output displays the virtual cluster ID for which the job run was submitted.
     * </p>
     * 
     * @param virtualClusterId
     *        This output displays the virtual cluster ID for which the job run was submitted.
     */

    public void setVirtualClusterId(String virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }

    /**
     * <p>
     * This output displays the virtual cluster ID for which the job run was submitted.
     * </p>
     * 
     * @return This output displays the virtual cluster ID for which the job run was submitted.
     */

    public String getVirtualClusterId() {
        return this.virtualClusterId;
    }

    /**
     * <p>
     * This output displays the virtual cluster ID for which the job run was submitted.
     * </p>
     * 
     * @param virtualClusterId
     *        This output displays the virtual cluster ID for which the job run was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunResult withVirtualClusterId(String virtualClusterId) {
        setVirtualClusterId(virtualClusterId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVirtualClusterId() != null)
            sb.append("VirtualClusterId: ").append(getVirtualClusterId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartJobRunResult == false)
            return false;
        StartJobRunResult other = (StartJobRunResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVirtualClusterId() == null ^ this.getVirtualClusterId() == null)
            return false;
        if (other.getVirtualClusterId() != null && other.getVirtualClusterId().equals(this.getVirtualClusterId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVirtualClusterId() == null) ? 0 : getVirtualClusterId().hashCode());
        return hashCode;
    }

    @Override
    public StartJobRunResult clone() {
        try {
            return (StartJobRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
