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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListEnvironmentProfiles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Web Services account where you want to list environment profiles.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Amazon Web Services region where you want to list environment profiles.
     * </p>
     */
    private String awsAccountRegion;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the blueprint that was used to create the environment profiles that you want to list.
     * </p>
     */
    private String environmentBlueprintIdentifier;
    /**
     * <p>
     * The maximum number of environment profiles to return in a single call to <code>ListEnvironmentProfiles</code>.
     * When the number of environment profiles to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListEnvironmentProfiles</code> to list the next set of environment profiles.
     * </p>
     */
    private Integer maxResults;
    /** <p/> */
    private String name;
    /**
     * <p>
     * When the number of environment profiles is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * environment profiles, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentProfiles</code> to list the next set of
     * environment profiles.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier of the Amazon DataZone project.
     * </p>
     */
    private String projectIdentifier;

    /**
     * <p>
     * The identifier of the Amazon Web Services account where you want to list environment profiles.
     * </p>
     * 
     * @param awsAccountId
     *        The identifier of the Amazon Web Services account where you want to list environment profiles.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account where you want to list environment profiles.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services account where you want to list environment profiles.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account where you want to list environment profiles.
     * </p>
     * 
     * @param awsAccountId
     *        The identifier of the Amazon Web Services account where you want to list environment profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProfilesRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services region where you want to list environment profiles.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services region where you want to list environment profiles.
     */

    public void setAwsAccountRegion(String awsAccountRegion) {
        this.awsAccountRegion = awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services region where you want to list environment profiles.
     * </p>
     * 
     * @return The Amazon Web Services region where you want to list environment profiles.
     */

    public String getAwsAccountRegion() {
        return this.awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services region where you want to list environment profiles.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services region where you want to list environment profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProfilesRequest withAwsAccountRegion(String awsAccountRegion) {
        setAwsAccountRegion(awsAccountRegion);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProfilesRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the blueprint that was used to create the environment profiles that you want to list.
     * </p>
     * 
     * @param environmentBlueprintIdentifier
     *        The identifier of the blueprint that was used to create the environment profiles that you want to list.
     */

    public void setEnvironmentBlueprintIdentifier(String environmentBlueprintIdentifier) {
        this.environmentBlueprintIdentifier = environmentBlueprintIdentifier;
    }

    /**
     * <p>
     * The identifier of the blueprint that was used to create the environment profiles that you want to list.
     * </p>
     * 
     * @return The identifier of the blueprint that was used to create the environment profiles that you want to list.
     */

    public String getEnvironmentBlueprintIdentifier() {
        return this.environmentBlueprintIdentifier;
    }

    /**
     * <p>
     * The identifier of the blueprint that was used to create the environment profiles that you want to list.
     * </p>
     * 
     * @param environmentBlueprintIdentifier
     *        The identifier of the blueprint that was used to create the environment profiles that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProfilesRequest withEnvironmentBlueprintIdentifier(String environmentBlueprintIdentifier) {
        setEnvironmentBlueprintIdentifier(environmentBlueprintIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of environment profiles to return in a single call to <code>ListEnvironmentProfiles</code>.
     * When the number of environment profiles to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListEnvironmentProfiles</code> to list the next set of environment profiles.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environment profiles to return in a single call to
     *        <code>ListEnvironmentProfiles</code>. When the number of environment profiles to be listed is greater than
     *        the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you can
     *        use in a subsequent call to <code>ListEnvironmentProfiles</code> to list the next set of environment
     *        profiles.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of environment profiles to return in a single call to <code>ListEnvironmentProfiles</code>.
     * When the number of environment profiles to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListEnvironmentProfiles</code> to list the next set of environment profiles.
     * </p>
     * 
     * @return The maximum number of environment profiles to return in a single call to
     *         <code>ListEnvironmentProfiles</code>. When the number of environment profiles to be listed is greater
     *         than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you
     *         can use in a subsequent call to <code>ListEnvironmentProfiles</code> to list the next set of environment
     *         profiles.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of environment profiles to return in a single call to <code>ListEnvironmentProfiles</code>.
     * When the number of environment profiles to be listed is greater than the value of <code>MaxResults</code>, the
     * response contains a <code>NextToken</code> value that you can use in a subsequent call to
     * <code>ListEnvironmentProfiles</code> to list the next set of environment profiles.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environment profiles to return in a single call to
     *        <code>ListEnvironmentProfiles</code>. When the number of environment profiles to be listed is greater than
     *        the value of <code>MaxResults</code>, the response contains a <code>NextToken</code> value that you can
     *        use in a subsequent call to <code>ListEnvironmentProfiles</code> to list the next set of environment
     *        profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProfilesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p/>
     * 
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p/>
     * 
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProfilesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When the number of environment profiles is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * environment profiles, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentProfiles</code> to list the next set of
     * environment profiles.
     * </p>
     * 
     * @param nextToken
     *        When the number of environment profiles is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of environment profiles, the response includes a pagination token named <code>NextToken</code>. You can
     *        specify this <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentProfiles</code> to
     *        list the next set of environment profiles.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of environment profiles is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * environment profiles, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentProfiles</code> to list the next set of
     * environment profiles.
     * </p>
     * 
     * @return When the number of environment profiles is greater than the default value for the <code>MaxResults</code>
     *         parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *         of environment profiles, the response includes a pagination token named <code>NextToken</code>. You can
     *         specify this <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentProfiles</code> to
     *         list the next set of environment profiles.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of environment profiles is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * environment profiles, the response includes a pagination token named <code>NextToken</code>. You can specify this
     * <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentProfiles</code> to list the next set of
     * environment profiles.
     * </p>
     * 
     * @param nextToken
     *        When the number of environment profiles is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of environment profiles, the response includes a pagination token named <code>NextToken</code>. You can
     *        specify this <code>NextToken</code> value in a subsequent call to <code>ListEnvironmentProfiles</code> to
     *        list the next set of environment profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProfilesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the Amazon DataZone project.
     */

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone project.
     */

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the Amazon DataZone project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentProfilesRequest withProjectIdentifier(String projectIdentifier) {
        setProjectIdentifier(projectIdentifier);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsAccountRegion() != null)
            sb.append("AwsAccountRegion: ").append(getAwsAccountRegion()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnvironmentBlueprintIdentifier() != null)
            sb.append("EnvironmentBlueprintIdentifier: ").append(getEnvironmentBlueprintIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getProjectIdentifier() != null)
            sb.append("ProjectIdentifier: ").append(getProjectIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnvironmentProfilesRequest == false)
            return false;
        ListEnvironmentProfilesRequest other = (ListEnvironmentProfilesRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsAccountRegion() == null ^ this.getAwsAccountRegion() == null)
            return false;
        if (other.getAwsAccountRegion() != null && other.getAwsAccountRegion().equals(this.getAwsAccountRegion()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnvironmentBlueprintIdentifier() == null ^ this.getEnvironmentBlueprintIdentifier() == null)
            return false;
        if (other.getEnvironmentBlueprintIdentifier() != null
                && other.getEnvironmentBlueprintIdentifier().equals(this.getEnvironmentBlueprintIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProjectIdentifier() == null ^ this.getProjectIdentifier() == null)
            return false;
        if (other.getProjectIdentifier() != null && other.getProjectIdentifier().equals(this.getProjectIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountRegion() == null) ? 0 : getAwsAccountRegion().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentBlueprintIdentifier() == null) ? 0 : getEnvironmentBlueprintIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProjectIdentifier() == null) ? 0 : getProjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentProfilesRequest clone() {
        return (ListEnvironmentProfilesRequest) super.clone();
    }

}
