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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A wrapper object holding the Amazon API Gateway proxy summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ApiGatewayProxySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiGatewayProxySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource ID of the API Gateway for the proxy.
     * </p>
     */
    private String apiGatewayId;
    /**
     * <p>
     * The type of API Gateway endpoint created.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer configured by the API Gateway proxy.
     * </p>
     */
    private String nlbArn;
    /**
     * <p>
     * The name of the Network Load Balancer that is configured by the API Gateway proxy.
     * </p>
     */
    private String nlbName;
    /**
     * <p>
     * The endpoint URL of the API Gateway proxy.
     * </p>
     */
    private String proxyUrl;
    /**
     * <p>
     * The name of the API Gateway stage. The name defaults to <code>prod</code>.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The <code>VpcLink</code> ID of the API Gateway proxy.
     * </p>
     */
    private String vpcLinkId;

    /**
     * <p>
     * The resource ID of the API Gateway for the proxy.
     * </p>
     * 
     * @param apiGatewayId
     *        The resource ID of the API Gateway for the proxy.
     */

    public void setApiGatewayId(String apiGatewayId) {
        this.apiGatewayId = apiGatewayId;
    }

    /**
     * <p>
     * The resource ID of the API Gateway for the proxy.
     * </p>
     * 
     * @return The resource ID of the API Gateway for the proxy.
     */

    public String getApiGatewayId() {
        return this.apiGatewayId;
    }

    /**
     * <p>
     * The resource ID of the API Gateway for the proxy.
     * </p>
     * 
     * @param apiGatewayId
     *        The resource ID of the API Gateway for the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayProxySummary withApiGatewayId(String apiGatewayId) {
        setApiGatewayId(apiGatewayId);
        return this;
    }

    /**
     * <p>
     * The type of API Gateway endpoint created.
     * </p>
     * 
     * @param endpointType
     *        The type of API Gateway endpoint created.
     * @see ApiGatewayEndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of API Gateway endpoint created.
     * </p>
     * 
     * @return The type of API Gateway endpoint created.
     * @see ApiGatewayEndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of API Gateway endpoint created.
     * </p>
     * 
     * @param endpointType
     *        The type of API Gateway endpoint created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiGatewayEndpointType
     */

    public ApiGatewayProxySummary withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of API Gateway endpoint created.
     * </p>
     * 
     * @param endpointType
     *        The type of API Gateway endpoint created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiGatewayEndpointType
     */

    public ApiGatewayProxySummary withEndpointType(ApiGatewayEndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer configured by the API Gateway proxy.
     * </p>
     * 
     * @param nlbArn
     *        The Amazon Resource Name (ARN) of the Network Load Balancer configured by the API Gateway proxy.
     */

    public void setNlbArn(String nlbArn) {
        this.nlbArn = nlbArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer configured by the API Gateway proxy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Network Load Balancer configured by the API Gateway proxy.
     */

    public String getNlbArn() {
        return this.nlbArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Load Balancer configured by the API Gateway proxy.
     * </p>
     * 
     * @param nlbArn
     *        The Amazon Resource Name (ARN) of the Network Load Balancer configured by the API Gateway proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayProxySummary withNlbArn(String nlbArn) {
        setNlbArn(nlbArn);
        return this;
    }

    /**
     * <p>
     * The name of the Network Load Balancer that is configured by the API Gateway proxy.
     * </p>
     * 
     * @param nlbName
     *        The name of the Network Load Balancer that is configured by the API Gateway proxy.
     */

    public void setNlbName(String nlbName) {
        this.nlbName = nlbName;
    }

    /**
     * <p>
     * The name of the Network Load Balancer that is configured by the API Gateway proxy.
     * </p>
     * 
     * @return The name of the Network Load Balancer that is configured by the API Gateway proxy.
     */

    public String getNlbName() {
        return this.nlbName;
    }

    /**
     * <p>
     * The name of the Network Load Balancer that is configured by the API Gateway proxy.
     * </p>
     * 
     * @param nlbName
     *        The name of the Network Load Balancer that is configured by the API Gateway proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayProxySummary withNlbName(String nlbName) {
        setNlbName(nlbName);
        return this;
    }

    /**
     * <p>
     * The endpoint URL of the API Gateway proxy.
     * </p>
     * 
     * @param proxyUrl
     *        The endpoint URL of the API Gateway proxy.
     */

    public void setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }

    /**
     * <p>
     * The endpoint URL of the API Gateway proxy.
     * </p>
     * 
     * @return The endpoint URL of the API Gateway proxy.
     */

    public String getProxyUrl() {
        return this.proxyUrl;
    }

    /**
     * <p>
     * The endpoint URL of the API Gateway proxy.
     * </p>
     * 
     * @param proxyUrl
     *        The endpoint URL of the API Gateway proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayProxySummary withProxyUrl(String proxyUrl) {
        setProxyUrl(proxyUrl);
        return this;
    }

    /**
     * <p>
     * The name of the API Gateway stage. The name defaults to <code>prod</code>.
     * </p>
     * 
     * @param stageName
     *        The name of the API Gateway stage. The name defaults to <code>prod</code>.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the API Gateway stage. The name defaults to <code>prod</code>.
     * </p>
     * 
     * @return The name of the API Gateway stage. The name defaults to <code>prod</code>.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the API Gateway stage. The name defaults to <code>prod</code>.
     * </p>
     * 
     * @param stageName
     *        The name of the API Gateway stage. The name defaults to <code>prod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayProxySummary withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The <code>VpcLink</code> ID of the API Gateway proxy.
     * </p>
     * 
     * @param vpcLinkId
     *        The <code>VpcLink</code> ID of the API Gateway proxy.
     */

    public void setVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
    }

    /**
     * <p>
     * The <code>VpcLink</code> ID of the API Gateway proxy.
     * </p>
     * 
     * @return The <code>VpcLink</code> ID of the API Gateway proxy.
     */

    public String getVpcLinkId() {
        return this.vpcLinkId;
    }

    /**
     * <p>
     * The <code>VpcLink</code> ID of the API Gateway proxy.
     * </p>
     * 
     * @param vpcLinkId
     *        The <code>VpcLink</code> ID of the API Gateway proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayProxySummary withVpcLinkId(String vpcLinkId) {
        setVpcLinkId(vpcLinkId);
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
        if (getApiGatewayId() != null)
            sb.append("ApiGatewayId: ").append(getApiGatewayId()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getNlbArn() != null)
            sb.append("NlbArn: ").append(getNlbArn()).append(",");
        if (getNlbName() != null)
            sb.append("NlbName: ").append(getNlbName()).append(",");
        if (getProxyUrl() != null)
            sb.append("ProxyUrl: ").append(getProxyUrl()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getVpcLinkId() != null)
            sb.append("VpcLinkId: ").append(getVpcLinkId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiGatewayProxySummary == false)
            return false;
        ApiGatewayProxySummary other = (ApiGatewayProxySummary) obj;
        if (other.getApiGatewayId() == null ^ this.getApiGatewayId() == null)
            return false;
        if (other.getApiGatewayId() != null && other.getApiGatewayId().equals(this.getApiGatewayId()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getNlbArn() == null ^ this.getNlbArn() == null)
            return false;
        if (other.getNlbArn() != null && other.getNlbArn().equals(this.getNlbArn()) == false)
            return false;
        if (other.getNlbName() == null ^ this.getNlbName() == null)
            return false;
        if (other.getNlbName() != null && other.getNlbName().equals(this.getNlbName()) == false)
            return false;
        if (other.getProxyUrl() == null ^ this.getProxyUrl() == null)
            return false;
        if (other.getProxyUrl() != null && other.getProxyUrl().equals(this.getProxyUrl()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getVpcLinkId() == null ^ this.getVpcLinkId() == null)
            return false;
        if (other.getVpcLinkId() != null && other.getVpcLinkId().equals(this.getVpcLinkId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiGatewayId() == null) ? 0 : getApiGatewayId().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getNlbArn() == null) ? 0 : getNlbArn().hashCode());
        hashCode = prime * hashCode + ((getNlbName() == null) ? 0 : getNlbName().hashCode());
        hashCode = prime * hashCode + ((getProxyUrl() == null) ? 0 : getProxyUrl().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getVpcLinkId() == null) ? 0 : getVpcLinkId().hashCode());
        return hashCode;
    }

    @Override
    public ApiGatewayProxySummary clone() {
        try {
            return (ApiGatewayProxySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubrefactorspaces.model.transform.ApiGatewayProxySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
