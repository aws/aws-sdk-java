/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkills" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSkillsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the skill group for which to list enabled skills. Required.
     * </p>
     */
    private String skillGroupArn;
    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * </p>
     */
    private String enablementType;
    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     */
    private String skillType;
    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * <code>MaxResults</code>. Required.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved. Required.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of the skill group for which to list enabled skills. Required.
     * </p>
     * 
     * @param skillGroupArn
     *        The ARN of the skill group for which to list enabled skills. Required.
     */

    public void setSkillGroupArn(String skillGroupArn) {
        this.skillGroupArn = skillGroupArn;
    }

    /**
     * <p>
     * The ARN of the skill group for which to list enabled skills. Required.
     * </p>
     * 
     * @return The ARN of the skill group for which to list enabled skills. Required.
     */

    public String getSkillGroupArn() {
        return this.skillGroupArn;
    }

    /**
     * <p>
     * The ARN of the skill group for which to list enabled skills. Required.
     * </p>
     * 
     * @param skillGroupArn
     *        The ARN of the skill group for which to list enabled skills. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsRequest withSkillGroupArn(String skillGroupArn) {
        setSkillGroupArn(skillGroupArn);
        return this;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * </p>
     * 
     * @param enablementType
     *        Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * @see EnablementTypeFilter
     */

    public void setEnablementType(String enablementType) {
        this.enablementType = enablementType;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * </p>
     * 
     * @return Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * @see EnablementTypeFilter
     */

    public String getEnablementType() {
        return this.enablementType;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * </p>
     * 
     * @param enablementType
     *        Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnablementTypeFilter
     */

    public ListSkillsRequest withEnablementType(String enablementType) {
        setEnablementType(enablementType);
        return this;
    }

    /**
     * <p>
     * Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * </p>
     * 
     * @param enablementType
     *        Whether the skill is enabled under the user's account, or if it requires linking to be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnablementTypeFilter
     */

    public ListSkillsRequest withEnablementType(EnablementTypeFilter enablementType) {
        this.enablementType = enablementType.toString();
        return this;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * 
     * @param skillType
     *        Whether the skill is publicly available or is a private skill.
     * @see SkillTypeFilter
     */

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * 
     * @return Whether the skill is publicly available or is a private skill.
     * @see SkillTypeFilter
     */

    public String getSkillType() {
        return this.skillType;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * 
     * @param skillType
     *        Whether the skill is publicly available or is a private skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SkillTypeFilter
     */

    public ListSkillsRequest withSkillType(String skillType) {
        setSkillType(skillType);
        return this;
    }

    /**
     * <p>
     * Whether the skill is publicly available or is a private skill.
     * </p>
     * 
     * @param skillType
     *        Whether the skill is publicly available or is a private skill.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SkillTypeFilter
     */

    public ListSkillsRequest withSkillType(SkillTypeFilter skillType) {
        this.skillType = skillType.toString();
        return this;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * <code>MaxResults</code>. Required.
     * </p>
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by <code>MaxResults</code>. Required.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * <code>MaxResults</code>. Required.
     * </p>
     * 
     * @return An optional token returned from a prior request. Use this token for pagination of results from this
     *         action. If this parameter is specified, the response includes only results beyond the token, up to the
     *         value specified by <code>MaxResults</code>. Required.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * <code>MaxResults</code>. Required.
     * </p>
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by <code>MaxResults</code>. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved. Required.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved. Required.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved. Required.
     * </p>
     * 
     * @return The maximum number of results to include in the response. If more results exist than the specified
     *         <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *         retrieved. Required.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved. Required.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSkillsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getSkillGroupArn() != null)
            sb.append("SkillGroupArn: ").append(getSkillGroupArn()).append(",");
        if (getEnablementType() != null)
            sb.append("EnablementType: ").append(getEnablementType()).append(",");
        if (getSkillType() != null)
            sb.append("SkillType: ").append(getSkillType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSkillsRequest == false)
            return false;
        ListSkillsRequest other = (ListSkillsRequest) obj;
        if (other.getSkillGroupArn() == null ^ this.getSkillGroupArn() == null)
            return false;
        if (other.getSkillGroupArn() != null && other.getSkillGroupArn().equals(this.getSkillGroupArn()) == false)
            return false;
        if (other.getEnablementType() == null ^ this.getEnablementType() == null)
            return false;
        if (other.getEnablementType() != null && other.getEnablementType().equals(this.getEnablementType()) == false)
            return false;
        if (other.getSkillType() == null ^ this.getSkillType() == null)
            return false;
        if (other.getSkillType() != null && other.getSkillType().equals(this.getSkillType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillGroupArn() == null) ? 0 : getSkillGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEnablementType() == null) ? 0 : getEnablementType().hashCode());
        hashCode = prime * hashCode + ((getSkillType() == null) ? 0 : getSkillType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListSkillsRequest clone() {
        return (ListSkillsRequest) super.clone();
    }

}
