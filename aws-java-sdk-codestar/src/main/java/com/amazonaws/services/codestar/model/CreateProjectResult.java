/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String projectTemplateId;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param id
     *        Reserved for future use.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param id
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param arn
     *        Reserved for future use.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param arn
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param clientRequestToken
     *        Reserved for future use.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param clientRequestToken
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectResult withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param projectTemplateId
     *        Reserved for future use.
     */

    public void setProjectTemplateId(String projectTemplateId) {
        this.projectTemplateId = projectTemplateId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getProjectTemplateId() {
        return this.projectTemplateId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param projectTemplateId
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectResult withProjectTemplateId(String projectTemplateId) {
        setProjectTemplateId(projectTemplateId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getProjectTemplateId() != null)
            sb.append("ProjectTemplateId: ").append(getProjectTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectResult == false)
            return false;
        CreateProjectResult other = (CreateProjectResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getProjectTemplateId() == null ^ this.getProjectTemplateId() == null)
            return false;
        if (other.getProjectTemplateId() != null && other.getProjectTemplateId().equals(this.getProjectTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getProjectTemplateId() == null) ? 0 : getProjectTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectResult clone() {
        try {
            return (CreateProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
