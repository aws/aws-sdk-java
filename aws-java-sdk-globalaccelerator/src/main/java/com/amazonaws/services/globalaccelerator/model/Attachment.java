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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A cross-account attachment in Global Accelerator. A cross-account attachment specifies the <i>principals</i> who have
 * permission to work with <i>resources</i> in your account, which you also list in the attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/Attachment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment.
     * </p>
     */
    private String attachmentArn;
    /**
     * <p>
     * The name of the cross-account attachment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The principals included in the cross-account attachment.
     * </p>
     */
    private java.util.List<String> principals;
    /**
     * <p>
     * The resources included in the cross-account attachment.
     * </p>
     */
    private java.util.List<Resource> resources;
    /**
     * <p>
     * The date and time that the cross-account attachment was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The date and time that the cross-account attachment was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment.
     * </p>
     * 
     * @param attachmentArn
     *        The Amazon Resource Name (ARN) of the cross-account attachment.
     */

    public void setAttachmentArn(String attachmentArn) {
        this.attachmentArn = attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cross-account attachment.
     */

    public String getAttachmentArn() {
        return this.attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment.
     * </p>
     * 
     * @param attachmentArn
     *        The Amazon Resource Name (ARN) of the cross-account attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withAttachmentArn(String attachmentArn) {
        setAttachmentArn(attachmentArn);
        return this;
    }

    /**
     * <p>
     * The name of the cross-account attachment.
     * </p>
     * 
     * @param name
     *        The name of the cross-account attachment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cross-account attachment.
     * </p>
     * 
     * @return The name of the cross-account attachment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cross-account attachment.
     * </p>
     * 
     * @param name
     *        The name of the cross-account attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The principals included in the cross-account attachment.
     * </p>
     * 
     * @return The principals included in the cross-account attachment.
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * The principals included in the cross-account attachment.
     * </p>
     * 
     * @param principals
     *        The principals included in the cross-account attachment.
     */

    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * The principals included in the cross-account attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        The principals included in the cross-account attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withPrincipals(String... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<String>(principals.length));
        }
        for (String ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The principals included in the cross-account attachment.
     * </p>
     * 
     * @param principals
     *        The principals included in the cross-account attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * The resources included in the cross-account attachment.
     * </p>
     * 
     * @return The resources included in the cross-account attachment.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * <p>
     * The resources included in the cross-account attachment.
     * </p>
     * 
     * @param resources
     *        The resources included in the cross-account attachment.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * <p>
     * The resources included in the cross-account attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The resources included in the cross-account attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources included in the cross-account attachment.
     * </p>
     * 
     * @param resources
     *        The resources included in the cross-account attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The date and time that the cross-account attachment was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the cross-account attachment was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the cross-account attachment was last modified.
     * </p>
     * 
     * @return The date and time that the cross-account attachment was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the cross-account attachment was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the cross-account attachment was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the cross-account attachment was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the cross-account attachment was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that the cross-account attachment was created.
     * </p>
     * 
     * @return The date and time that the cross-account attachment was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that the cross-account attachment was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the cross-account attachment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
        if (getAttachmentArn() != null)
            sb.append("AttachmentArn: ").append(getAttachmentArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attachment == false)
            return false;
        Attachment other = (Attachment) obj;
        if (other.getAttachmentArn() == null ^ this.getAttachmentArn() == null)
            return false;
        if (other.getAttachmentArn() != null && other.getAttachmentArn().equals(this.getAttachmentArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentArn() == null) ? 0 : getAttachmentArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public Attachment clone() {
        try {
            return (Attachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.AttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
