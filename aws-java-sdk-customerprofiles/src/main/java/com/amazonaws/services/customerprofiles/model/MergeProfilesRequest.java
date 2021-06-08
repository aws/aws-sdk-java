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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/MergeProfiles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergeProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The identifier of the profile to be taken.
     * </p>
     */
    private String mainProfileId;
    /**
     * <p>
     * The identifier of the profile to be merged into MainProfileId.
     * </p>
     */
    private java.util.List<String> profileIdsToBeMerged;
    /**
     * <p>
     * The identifiers of the fields in the profile that has the information you want to apply to the merge. For
     * example, say you want to merge EmailAddress from Profile1 into MainProfile. This would be the identifier of the
     * EmailAddress field in Profile1.
     * </p>
     */
    private FieldSourceProfileIds fieldSourceProfileIds;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeProfilesRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The identifier of the profile to be taken.
     * </p>
     * 
     * @param mainProfileId
     *        The identifier of the profile to be taken.
     */

    public void setMainProfileId(String mainProfileId) {
        this.mainProfileId = mainProfileId;
    }

    /**
     * <p>
     * The identifier of the profile to be taken.
     * </p>
     * 
     * @return The identifier of the profile to be taken.
     */

    public String getMainProfileId() {
        return this.mainProfileId;
    }

    /**
     * <p>
     * The identifier of the profile to be taken.
     * </p>
     * 
     * @param mainProfileId
     *        The identifier of the profile to be taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeProfilesRequest withMainProfileId(String mainProfileId) {
        setMainProfileId(mainProfileId);
        return this;
    }

    /**
     * <p>
     * The identifier of the profile to be merged into MainProfileId.
     * </p>
     * 
     * @return The identifier of the profile to be merged into MainProfileId.
     */

    public java.util.List<String> getProfileIdsToBeMerged() {
        return profileIdsToBeMerged;
    }

    /**
     * <p>
     * The identifier of the profile to be merged into MainProfileId.
     * </p>
     * 
     * @param profileIdsToBeMerged
     *        The identifier of the profile to be merged into MainProfileId.
     */

    public void setProfileIdsToBeMerged(java.util.Collection<String> profileIdsToBeMerged) {
        if (profileIdsToBeMerged == null) {
            this.profileIdsToBeMerged = null;
            return;
        }

        this.profileIdsToBeMerged = new java.util.ArrayList<String>(profileIdsToBeMerged);
    }

    /**
     * <p>
     * The identifier of the profile to be merged into MainProfileId.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileIdsToBeMerged(java.util.Collection)} or {@link #withProfileIdsToBeMerged(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param profileIdsToBeMerged
     *        The identifier of the profile to be merged into MainProfileId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeProfilesRequest withProfileIdsToBeMerged(String... profileIdsToBeMerged) {
        if (this.profileIdsToBeMerged == null) {
            setProfileIdsToBeMerged(new java.util.ArrayList<String>(profileIdsToBeMerged.length));
        }
        for (String ele : profileIdsToBeMerged) {
            this.profileIdsToBeMerged.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the profile to be merged into MainProfileId.
     * </p>
     * 
     * @param profileIdsToBeMerged
     *        The identifier of the profile to be merged into MainProfileId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeProfilesRequest withProfileIdsToBeMerged(java.util.Collection<String> profileIdsToBeMerged) {
        setProfileIdsToBeMerged(profileIdsToBeMerged);
        return this;
    }

    /**
     * <p>
     * The identifiers of the fields in the profile that has the information you want to apply to the merge. For
     * example, say you want to merge EmailAddress from Profile1 into MainProfile. This would be the identifier of the
     * EmailAddress field in Profile1.
     * </p>
     * 
     * @param fieldSourceProfileIds
     *        The identifiers of the fields in the profile that has the information you want to apply to the merge. For
     *        example, say you want to merge EmailAddress from Profile1 into MainProfile. This would be the identifier
     *        of the EmailAddress field in Profile1.
     */

    public void setFieldSourceProfileIds(FieldSourceProfileIds fieldSourceProfileIds) {
        this.fieldSourceProfileIds = fieldSourceProfileIds;
    }

    /**
     * <p>
     * The identifiers of the fields in the profile that has the information you want to apply to the merge. For
     * example, say you want to merge EmailAddress from Profile1 into MainProfile. This would be the identifier of the
     * EmailAddress field in Profile1.
     * </p>
     * 
     * @return The identifiers of the fields in the profile that has the information you want to apply to the merge. For
     *         example, say you want to merge EmailAddress from Profile1 into MainProfile. This would be the identifier
     *         of the EmailAddress field in Profile1.
     */

    public FieldSourceProfileIds getFieldSourceProfileIds() {
        return this.fieldSourceProfileIds;
    }

    /**
     * <p>
     * The identifiers of the fields in the profile that has the information you want to apply to the merge. For
     * example, say you want to merge EmailAddress from Profile1 into MainProfile. This would be the identifier of the
     * EmailAddress field in Profile1.
     * </p>
     * 
     * @param fieldSourceProfileIds
     *        The identifiers of the fields in the profile that has the information you want to apply to the merge. For
     *        example, say you want to merge EmailAddress from Profile1 into MainProfile. This would be the identifier
     *        of the EmailAddress field in Profile1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeProfilesRequest withFieldSourceProfileIds(FieldSourceProfileIds fieldSourceProfileIds) {
        setFieldSourceProfileIds(fieldSourceProfileIds);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getMainProfileId() != null)
            sb.append("MainProfileId: ").append(getMainProfileId()).append(",");
        if (getProfileIdsToBeMerged() != null)
            sb.append("ProfileIdsToBeMerged: ").append(getProfileIdsToBeMerged()).append(",");
        if (getFieldSourceProfileIds() != null)
            sb.append("FieldSourceProfileIds: ").append(getFieldSourceProfileIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeProfilesRequest == false)
            return false;
        MergeProfilesRequest other = (MergeProfilesRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getMainProfileId() == null ^ this.getMainProfileId() == null)
            return false;
        if (other.getMainProfileId() != null && other.getMainProfileId().equals(this.getMainProfileId()) == false)
            return false;
        if (other.getProfileIdsToBeMerged() == null ^ this.getProfileIdsToBeMerged() == null)
            return false;
        if (other.getProfileIdsToBeMerged() != null && other.getProfileIdsToBeMerged().equals(this.getProfileIdsToBeMerged()) == false)
            return false;
        if (other.getFieldSourceProfileIds() == null ^ this.getFieldSourceProfileIds() == null)
            return false;
        if (other.getFieldSourceProfileIds() != null && other.getFieldSourceProfileIds().equals(this.getFieldSourceProfileIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getMainProfileId() == null) ? 0 : getMainProfileId().hashCode());
        hashCode = prime * hashCode + ((getProfileIdsToBeMerged() == null) ? 0 : getProfileIdsToBeMerged().hashCode());
        hashCode = prime * hashCode + ((getFieldSourceProfileIds() == null) ? 0 : getFieldSourceProfileIds().hashCode());
        return hashCode;
    }

    @Override
    public MergeProfilesRequest clone() {
        return (MergeProfilesRequest) super.clone();
    }

}
