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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetAutoMergingPreview"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAutoMergingPreviewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The number of match groups in the domain that have been reviewed in this preview dry run.
     * </p>
     */
    private Long numberOfMatchesInSample;
    /**
     * <p>
     * The number of profiles found in this preview dry run.
     * </p>
     */
    private Long numberOfProfilesInSample;
    /**
     * <p>
     * The number of profiles that would be merged if this wasn't a preview dry run.
     * </p>
     */
    private Long numberOfProfilesWillBeMerged;

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

    public GetAutoMergingPreviewResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The number of match groups in the domain that have been reviewed in this preview dry run.
     * </p>
     * 
     * @param numberOfMatchesInSample
     *        The number of match groups in the domain that have been reviewed in this preview dry run.
     */

    public void setNumberOfMatchesInSample(Long numberOfMatchesInSample) {
        this.numberOfMatchesInSample = numberOfMatchesInSample;
    }

    /**
     * <p>
     * The number of match groups in the domain that have been reviewed in this preview dry run.
     * </p>
     * 
     * @return The number of match groups in the domain that have been reviewed in this preview dry run.
     */

    public Long getNumberOfMatchesInSample() {
        return this.numberOfMatchesInSample;
    }

    /**
     * <p>
     * The number of match groups in the domain that have been reviewed in this preview dry run.
     * </p>
     * 
     * @param numberOfMatchesInSample
     *        The number of match groups in the domain that have been reviewed in this preview dry run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoMergingPreviewResult withNumberOfMatchesInSample(Long numberOfMatchesInSample) {
        setNumberOfMatchesInSample(numberOfMatchesInSample);
        return this;
    }

    /**
     * <p>
     * The number of profiles found in this preview dry run.
     * </p>
     * 
     * @param numberOfProfilesInSample
     *        The number of profiles found in this preview dry run.
     */

    public void setNumberOfProfilesInSample(Long numberOfProfilesInSample) {
        this.numberOfProfilesInSample = numberOfProfilesInSample;
    }

    /**
     * <p>
     * The number of profiles found in this preview dry run.
     * </p>
     * 
     * @return The number of profiles found in this preview dry run.
     */

    public Long getNumberOfProfilesInSample() {
        return this.numberOfProfilesInSample;
    }

    /**
     * <p>
     * The number of profiles found in this preview dry run.
     * </p>
     * 
     * @param numberOfProfilesInSample
     *        The number of profiles found in this preview dry run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoMergingPreviewResult withNumberOfProfilesInSample(Long numberOfProfilesInSample) {
        setNumberOfProfilesInSample(numberOfProfilesInSample);
        return this;
    }

    /**
     * <p>
     * The number of profiles that would be merged if this wasn't a preview dry run.
     * </p>
     * 
     * @param numberOfProfilesWillBeMerged
     *        The number of profiles that would be merged if this wasn't a preview dry run.
     */

    public void setNumberOfProfilesWillBeMerged(Long numberOfProfilesWillBeMerged) {
        this.numberOfProfilesWillBeMerged = numberOfProfilesWillBeMerged;
    }

    /**
     * <p>
     * The number of profiles that would be merged if this wasn't a preview dry run.
     * </p>
     * 
     * @return The number of profiles that would be merged if this wasn't a preview dry run.
     */

    public Long getNumberOfProfilesWillBeMerged() {
        return this.numberOfProfilesWillBeMerged;
    }

    /**
     * <p>
     * The number of profiles that would be merged if this wasn't a preview dry run.
     * </p>
     * 
     * @param numberOfProfilesWillBeMerged
     *        The number of profiles that would be merged if this wasn't a preview dry run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoMergingPreviewResult withNumberOfProfilesWillBeMerged(Long numberOfProfilesWillBeMerged) {
        setNumberOfProfilesWillBeMerged(numberOfProfilesWillBeMerged);
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
        if (getNumberOfMatchesInSample() != null)
            sb.append("NumberOfMatchesInSample: ").append(getNumberOfMatchesInSample()).append(",");
        if (getNumberOfProfilesInSample() != null)
            sb.append("NumberOfProfilesInSample: ").append(getNumberOfProfilesInSample()).append(",");
        if (getNumberOfProfilesWillBeMerged() != null)
            sb.append("NumberOfProfilesWillBeMerged: ").append(getNumberOfProfilesWillBeMerged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAutoMergingPreviewResult == false)
            return false;
        GetAutoMergingPreviewResult other = (GetAutoMergingPreviewResult) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getNumberOfMatchesInSample() == null ^ this.getNumberOfMatchesInSample() == null)
            return false;
        if (other.getNumberOfMatchesInSample() != null && other.getNumberOfMatchesInSample().equals(this.getNumberOfMatchesInSample()) == false)
            return false;
        if (other.getNumberOfProfilesInSample() == null ^ this.getNumberOfProfilesInSample() == null)
            return false;
        if (other.getNumberOfProfilesInSample() != null && other.getNumberOfProfilesInSample().equals(this.getNumberOfProfilesInSample()) == false)
            return false;
        if (other.getNumberOfProfilesWillBeMerged() == null ^ this.getNumberOfProfilesWillBeMerged() == null)
            return false;
        if (other.getNumberOfProfilesWillBeMerged() != null && other.getNumberOfProfilesWillBeMerged().equals(this.getNumberOfProfilesWillBeMerged()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getNumberOfMatchesInSample() == null) ? 0 : getNumberOfMatchesInSample().hashCode());
        hashCode = prime * hashCode + ((getNumberOfProfilesInSample() == null) ? 0 : getNumberOfProfilesInSample().hashCode());
        hashCode = prime * hashCode + ((getNumberOfProfilesWillBeMerged() == null) ? 0 : getNumberOfProfilesWillBeMerged().hashCode());
        return hashCode;
    }

    @Override
    public GetAutoMergingPreviewResult clone() {
        try {
            return (GetAutoMergingPreviewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
