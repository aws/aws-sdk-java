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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationComponentDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Detailed information about an application component.
     * </p>
     */
    private ApplicationComponentDetail applicationComponentDetail;
    /**
     * <p>
     * The associated application group as defined in AWS Application Discovery Service.
     * </p>
     */
    private java.util.List<AssociatedApplication> associatedApplications;
    /**
     * <p>
     * A list of the IDs of the servers on which the application component is running.
     * </p>
     */
    private java.util.List<String> associatedServerIds;
    /**
     * <p>
     * Set to true if the application component belongs to more than one application group.
     * </p>
     */
    private Boolean moreApplicationResource;

    /**
     * <p>
     * Detailed information about an application component.
     * </p>
     * 
     * @param applicationComponentDetail
     *        Detailed information about an application component.
     */

    public void setApplicationComponentDetail(ApplicationComponentDetail applicationComponentDetail) {
        this.applicationComponentDetail = applicationComponentDetail;
    }

    /**
     * <p>
     * Detailed information about an application component.
     * </p>
     * 
     * @return Detailed information about an application component.
     */

    public ApplicationComponentDetail getApplicationComponentDetail() {
        return this.applicationComponentDetail;
    }

    /**
     * <p>
     * Detailed information about an application component.
     * </p>
     * 
     * @param applicationComponentDetail
     *        Detailed information about an application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationComponentDetailsResult withApplicationComponentDetail(ApplicationComponentDetail applicationComponentDetail) {
        setApplicationComponentDetail(applicationComponentDetail);
        return this;
    }

    /**
     * <p>
     * The associated application group as defined in AWS Application Discovery Service.
     * </p>
     * 
     * @return The associated application group as defined in AWS Application Discovery Service.
     */

    public java.util.List<AssociatedApplication> getAssociatedApplications() {
        return associatedApplications;
    }

    /**
     * <p>
     * The associated application group as defined in AWS Application Discovery Service.
     * </p>
     * 
     * @param associatedApplications
     *        The associated application group as defined in AWS Application Discovery Service.
     */

    public void setAssociatedApplications(java.util.Collection<AssociatedApplication> associatedApplications) {
        if (associatedApplications == null) {
            this.associatedApplications = null;
            return;
        }

        this.associatedApplications = new java.util.ArrayList<AssociatedApplication>(associatedApplications);
    }

    /**
     * <p>
     * The associated application group as defined in AWS Application Discovery Service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedApplications(java.util.Collection)} or
     * {@link #withAssociatedApplications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associatedApplications
     *        The associated application group as defined in AWS Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationComponentDetailsResult withAssociatedApplications(AssociatedApplication... associatedApplications) {
        if (this.associatedApplications == null) {
            setAssociatedApplications(new java.util.ArrayList<AssociatedApplication>(associatedApplications.length));
        }
        for (AssociatedApplication ele : associatedApplications) {
            this.associatedApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The associated application group as defined in AWS Application Discovery Service.
     * </p>
     * 
     * @param associatedApplications
     *        The associated application group as defined in AWS Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationComponentDetailsResult withAssociatedApplications(java.util.Collection<AssociatedApplication> associatedApplications) {
        setAssociatedApplications(associatedApplications);
        return this;
    }

    /**
     * <p>
     * A list of the IDs of the servers on which the application component is running.
     * </p>
     * 
     * @return A list of the IDs of the servers on which the application component is running.
     */

    public java.util.List<String> getAssociatedServerIds() {
        return associatedServerIds;
    }

    /**
     * <p>
     * A list of the IDs of the servers on which the application component is running.
     * </p>
     * 
     * @param associatedServerIds
     *        A list of the IDs of the servers on which the application component is running.
     */

    public void setAssociatedServerIds(java.util.Collection<String> associatedServerIds) {
        if (associatedServerIds == null) {
            this.associatedServerIds = null;
            return;
        }

        this.associatedServerIds = new java.util.ArrayList<String>(associatedServerIds);
    }

    /**
     * <p>
     * A list of the IDs of the servers on which the application component is running.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedServerIds(java.util.Collection)} or {@link #withAssociatedServerIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param associatedServerIds
     *        A list of the IDs of the servers on which the application component is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationComponentDetailsResult withAssociatedServerIds(String... associatedServerIds) {
        if (this.associatedServerIds == null) {
            setAssociatedServerIds(new java.util.ArrayList<String>(associatedServerIds.length));
        }
        for (String ele : associatedServerIds) {
            this.associatedServerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the IDs of the servers on which the application component is running.
     * </p>
     * 
     * @param associatedServerIds
     *        A list of the IDs of the servers on which the application component is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationComponentDetailsResult withAssociatedServerIds(java.util.Collection<String> associatedServerIds) {
        setAssociatedServerIds(associatedServerIds);
        return this;
    }

    /**
     * <p>
     * Set to true if the application component belongs to more than one application group.
     * </p>
     * 
     * @param moreApplicationResource
     *        Set to true if the application component belongs to more than one application group.
     */

    public void setMoreApplicationResource(Boolean moreApplicationResource) {
        this.moreApplicationResource = moreApplicationResource;
    }

    /**
     * <p>
     * Set to true if the application component belongs to more than one application group.
     * </p>
     * 
     * @return Set to true if the application component belongs to more than one application group.
     */

    public Boolean getMoreApplicationResource() {
        return this.moreApplicationResource;
    }

    /**
     * <p>
     * Set to true if the application component belongs to more than one application group.
     * </p>
     * 
     * @param moreApplicationResource
     *        Set to true if the application component belongs to more than one application group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationComponentDetailsResult withMoreApplicationResource(Boolean moreApplicationResource) {
        setMoreApplicationResource(moreApplicationResource);
        return this;
    }

    /**
     * <p>
     * Set to true if the application component belongs to more than one application group.
     * </p>
     * 
     * @return Set to true if the application component belongs to more than one application group.
     */

    public Boolean isMoreApplicationResource() {
        return this.moreApplicationResource;
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
        if (getApplicationComponentDetail() != null)
            sb.append("ApplicationComponentDetail: ").append(getApplicationComponentDetail()).append(",");
        if (getAssociatedApplications() != null)
            sb.append("AssociatedApplications: ").append(getAssociatedApplications()).append(",");
        if (getAssociatedServerIds() != null)
            sb.append("AssociatedServerIds: ").append(getAssociatedServerIds()).append(",");
        if (getMoreApplicationResource() != null)
            sb.append("MoreApplicationResource: ").append(getMoreApplicationResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationComponentDetailsResult == false)
            return false;
        GetApplicationComponentDetailsResult other = (GetApplicationComponentDetailsResult) obj;
        if (other.getApplicationComponentDetail() == null ^ this.getApplicationComponentDetail() == null)
            return false;
        if (other.getApplicationComponentDetail() != null && other.getApplicationComponentDetail().equals(this.getApplicationComponentDetail()) == false)
            return false;
        if (other.getAssociatedApplications() == null ^ this.getAssociatedApplications() == null)
            return false;
        if (other.getAssociatedApplications() != null && other.getAssociatedApplications().equals(this.getAssociatedApplications()) == false)
            return false;
        if (other.getAssociatedServerIds() == null ^ this.getAssociatedServerIds() == null)
            return false;
        if (other.getAssociatedServerIds() != null && other.getAssociatedServerIds().equals(this.getAssociatedServerIds()) == false)
            return false;
        if (other.getMoreApplicationResource() == null ^ this.getMoreApplicationResource() == null)
            return false;
        if (other.getMoreApplicationResource() != null && other.getMoreApplicationResource().equals(this.getMoreApplicationResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationComponentDetail() == null) ? 0 : getApplicationComponentDetail().hashCode());
        hashCode = prime * hashCode + ((getAssociatedApplications() == null) ? 0 : getAssociatedApplications().hashCode());
        hashCode = prime * hashCode + ((getAssociatedServerIds() == null) ? 0 : getAssociatedServerIds().hashCode());
        hashCode = prime * hashCode + ((getMoreApplicationResource() == null) ? 0 : getMoreApplicationResource().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationComponentDetailsResult clone() {
        try {
            return (GetApplicationComponentDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
