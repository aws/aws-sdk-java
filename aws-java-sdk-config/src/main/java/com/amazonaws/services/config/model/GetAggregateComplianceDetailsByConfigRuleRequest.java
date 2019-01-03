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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateComplianceDetailsByConfigRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAggregateComplianceDetailsByConfigRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     */
    private String configurationAggregatorName;
    /**
     * <p>
     * The name of the AWS Config rule for which you want compliance information.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The source region from where the data is aggregated.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The resource compliance status.
     * </p>
     * <note>
     * <p>
     * For the <code>GetAggregateComplianceDetailsByConfigRuleRequest</code> data type, AWS Config supports only the
     * <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> values.
     * </p>
     * </note>
     */
    private String complianceType;
    /**
     * <p>
     * The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a number
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     */

    public void setConfigurationAggregatorName(String configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @return The name of the configuration aggregator.
     */

    public String getConfigurationAggregatorName() {
        return this.configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateComplianceDetailsByConfigRuleRequest withConfigurationAggregatorName(String configurationAggregatorName) {
        setConfigurationAggregatorName(configurationAggregatorName);
        return this;
    }

    /**
     * <p>
     * The name of the AWS Config rule for which you want compliance information.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule for which you want compliance information.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule for which you want compliance information.
     * </p>
     * 
     * @return The name of the AWS Config rule for which you want compliance information.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule for which you want compliance information.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule for which you want compliance information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateComplianceDetailsByConfigRuleRequest withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     * 
     * @param accountId
     *        The 12-digit account ID of the source account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     * 
     * @return The 12-digit account ID of the source account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     * 
     * @param accountId
     *        The 12-digit account ID of the source account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateComplianceDetailsByConfigRuleRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The source region from where the data is aggregated.
     * </p>
     * 
     * @param awsRegion
     *        The source region from where the data is aggregated.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The source region from where the data is aggregated.
     * </p>
     * 
     * @return The source region from where the data is aggregated.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The source region from where the data is aggregated.
     * </p>
     * 
     * @param awsRegion
     *        The source region from where the data is aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateComplianceDetailsByConfigRuleRequest withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The resource compliance status.
     * </p>
     * <note>
     * <p>
     * For the <code>GetAggregateComplianceDetailsByConfigRuleRequest</code> data type, AWS Config supports only the
     * <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> values.
     * </p>
     * </note>
     * 
     * @param complianceType
     *        The resource compliance status.</p> <note>
     *        <p>
     *        For the <code>GetAggregateComplianceDetailsByConfigRuleRequest</code> data type, AWS Config supports only
     *        the <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> values.
     *        </p>
     * @see ComplianceType
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The resource compliance status.
     * </p>
     * <note>
     * <p>
     * For the <code>GetAggregateComplianceDetailsByConfigRuleRequest</code> data type, AWS Config supports only the
     * <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> values.
     * </p>
     * </note>
     * 
     * @return The resource compliance status.</p> <note>
     *         <p>
     *         For the <code>GetAggregateComplianceDetailsByConfigRuleRequest</code> data type, AWS Config supports only
     *         the <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *         <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> values.
     *         </p>
     * @see ComplianceType
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The resource compliance status.
     * </p>
     * <note>
     * <p>
     * For the <code>GetAggregateComplianceDetailsByConfigRuleRequest</code> data type, AWS Config supports only the
     * <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> values.
     * </p>
     * </note>
     * 
     * @param complianceType
     *        The resource compliance status.</p> <note>
     *        <p>
     *        For the <code>GetAggregateComplianceDetailsByConfigRuleRequest</code> data type, AWS Config supports only
     *        the <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> values.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public GetAggregateComplianceDetailsByConfigRuleRequest withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * The resource compliance status.
     * </p>
     * <note>
     * <p>
     * For the <code>GetAggregateComplianceDetailsByConfigRuleRequest</code> data type, AWS Config supports only the
     * <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> values.
     * </p>
     * </note>
     * 
     * @param complianceType
     *        The resource compliance status.</p> <note>
     *        <p>
     *        For the <code>GetAggregateComplianceDetailsByConfigRuleRequest</code> data type, AWS Config supports only
     *        the <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> values.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public GetAggregateComplianceDetailsByConfigRuleRequest withComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a number
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a
     *        number greater than 100. If you specify 0, AWS Config uses the default.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a number
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @return The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a
     *         number greater than 100. If you specify 0, AWS Config uses the default.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a number
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a
     *        number greater than 100. If you specify 0, AWS Config uses the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateComplianceDetailsByConfigRuleRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @return The nextToken string returned on a previous page that you use to get the next page of results in a
     *         paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateComplianceDetailsByConfigRuleRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getConfigurationAggregatorName() != null)
            sb.append("ConfigurationAggregatorName: ").append(getConfigurationAggregatorName()).append(",");
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAggregateComplianceDetailsByConfigRuleRequest == false)
            return false;
        GetAggregateComplianceDetailsByConfigRuleRequest other = (GetAggregateComplianceDetailsByConfigRuleRequest) obj;
        if (other.getConfigurationAggregatorName() == null ^ this.getConfigurationAggregatorName() == null)
            return false;
        if (other.getConfigurationAggregatorName() != null && other.getConfigurationAggregatorName().equals(this.getConfigurationAggregatorName()) == false)
            return false;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationAggregatorName() == null) ? 0 : getConfigurationAggregatorName().hashCode());
        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAggregateComplianceDetailsByConfigRuleRequest clone() {
        return (GetAggregateComplianceDetailsByConfigRuleRequest) super.clone();
    }

}
