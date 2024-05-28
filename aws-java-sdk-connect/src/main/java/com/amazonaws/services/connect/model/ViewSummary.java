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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of a view's metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ViewSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the view.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the view.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the view.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The description of the view.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The identifier of the view.
     * </p>
     * 
     * @param id
     *        The identifier of the view.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the view.
     * </p>
     * 
     * @return The identifier of the view.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the view.
     * </p>
     * 
     * @param id
     *        The identifier of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the view.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the view.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the view.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * 
     * @param name
     *        The name of the view.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * 
     * @return The name of the view.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the view.
     * </p>
     * 
     * @param name
     *        The name of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the view.
     * </p>
     * 
     * @param type
     *        The type of the view.
     * @see ViewType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the view.
     * </p>
     * 
     * @return The type of the view.
     * @see ViewType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the view.
     * </p>
     * 
     * @param type
     *        The type of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewType
     */

    public ViewSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the view.
     * </p>
     * 
     * @param type
     *        The type of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewType
     */

    public ViewSummary withType(ViewType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     * 
     * @param status
     *        Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The
     *        <code>PUBLISHED</code> status will initiate validation on the content.
     * @see ViewStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     * 
     * @return Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The
     *         <code>PUBLISHED</code> status will initiate validation on the content.
     * @see ViewStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     * 
     * @param status
     *        Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The
     *        <code>PUBLISHED</code> status will initiate validation on the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewStatus
     */

    public ViewSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The <code>PUBLISHED</code>
     * status will initiate validation on the content.
     * </p>
     * 
     * @param status
     *        Indicates the view status as either <code>SAVED</code> or <code>PUBLISHED</code>. The
     *        <code>PUBLISHED</code> status will initiate validation on the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewStatus
     */

    public ViewSummary withStatus(ViewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * 
     * @param description
     *        The description of the view.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * 
     * @return The description of the view.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the view.
     * </p>
     * 
     * @param description
     *        The description of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewSummary withDescription(String description) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof ViewSummary == false)
            return false;
        ViewSummary other = (ViewSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ViewSummary clone() {
        try {
            return (ViewSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ViewSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
