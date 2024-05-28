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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A view resource object. Contains metadata and content necessary to render the view.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/View" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class View implements Serializable, Cloneable, StructuredPojo {

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
     * The current version of the view.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     */
    private ViewContent content;

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

    public View withId(String id) {
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

    public View withArn(String arn) {
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

    public View withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current version of the view.
     * </p>
     * 
     * @param version
     *        The current version of the view.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the view.
     * </p>
     * 
     * @return The current version of the view.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The current version of the view.
     * </p>
     * 
     * @param version
     *        The current version of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     * 
     * @param content
     *        View content containing all content necessary to render a view except for runtime input data.
     */

    public void setContent(ViewContent content) {
        this.content = content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     * 
     * @return View content containing all content necessary to render a view except for runtime input data.
     */

    public ViewContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for runtime input data.
     * </p>
     * 
     * @param content
     *        View content containing all content necessary to render a view except for runtime input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public View withContent(ViewContent content) {
        setContent(content);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof View == false)
            return false;
        View other = (View) obj;
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
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
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
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public View clone() {
        try {
            return (View) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectparticipant.model.transform.ViewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
