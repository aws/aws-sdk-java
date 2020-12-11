/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateNetworkInsightsPathRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkInsightsPathRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateNetworkInsightsPathRequest> {

    /**
     * <p>
     * The IP address of the AWS resource that is the source of the path.
     * </p>
     */
    private String sourceIp;
    /**
     * <p>
     * The IP address of the AWS resource that is the destination of the path.
     * </p>
     */
    private String destinationIp;
    /**
     * <p>
     * The AWS resource that is the source of the path.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The AWS resource that is the destination of the path.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The protocol.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The destination port.
     * </p>
     */
    private Integer destinationPort;
    /**
     * <p>
     * The tags to add to the path.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The IP address of the AWS resource that is the source of the path.
     * </p>
     * 
     * @param sourceIp
     *        The IP address of the AWS resource that is the source of the path.
     */

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the source of the path.
     * </p>
     * 
     * @return The IP address of the AWS resource that is the source of the path.
     */

    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the source of the path.
     * </p>
     * 
     * @param sourceIp
     *        The IP address of the AWS resource that is the source of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsPathRequest withSourceIp(String sourceIp) {
        setSourceIp(sourceIp);
        return this;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the destination of the path.
     * </p>
     * 
     * @param destinationIp
     *        The IP address of the AWS resource that is the destination of the path.
     */

    public void setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the destination of the path.
     * </p>
     * 
     * @return The IP address of the AWS resource that is the destination of the path.
     */

    public String getDestinationIp() {
        return this.destinationIp;
    }

    /**
     * <p>
     * The IP address of the AWS resource that is the destination of the path.
     * </p>
     * 
     * @param destinationIp
     *        The IP address of the AWS resource that is the destination of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsPathRequest withDestinationIp(String destinationIp) {
        setDestinationIp(destinationIp);
        return this;
    }

    /**
     * <p>
     * The AWS resource that is the source of the path.
     * </p>
     * 
     * @param source
     *        The AWS resource that is the source of the path.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The AWS resource that is the source of the path.
     * </p>
     * 
     * @return The AWS resource that is the source of the path.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The AWS resource that is the source of the path.
     * </p>
     * 
     * @param source
     *        The AWS resource that is the source of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsPathRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The AWS resource that is the destination of the path.
     * </p>
     * 
     * @param destination
     *        The AWS resource that is the destination of the path.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The AWS resource that is the destination of the path.
     * </p>
     * 
     * @return The AWS resource that is the destination of the path.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The AWS resource that is the destination of the path.
     * </p>
     * 
     * @param destination
     *        The AWS resource that is the destination of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsPathRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @return The protocol.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public CreateNetworkInsightsPathRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol.
     * </p>
     * 
     * @param protocol
     *        The protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public CreateNetworkInsightsPathRequest withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The destination port.
     * </p>
     * 
     * @param destinationPort
     *        The destination port.
     */

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The destination port.
     * </p>
     * 
     * @return The destination port.
     */

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * <p>
     * The destination port.
     * </p>
     * 
     * @param destinationPort
     *        The destination port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsPathRequest withDestinationPort(Integer destinationPort) {
        setDestinationPort(destinationPort);
        return this;
    }

    /**
     * <p>
     * The tags to add to the path.
     * </p>
     * 
     * @return The tags to add to the path.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to add to the path.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to add to the path.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to add to the path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to add to the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsPathRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to add to the path.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to add to the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsPathRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsPathRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateNetworkInsightsPathRequest> getDryRunRequest() {
        Request<CreateNetworkInsightsPathRequest> request = new CreateNetworkInsightsPathRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSourceIp() != null)
            sb.append("SourceIp: ").append(getSourceIp()).append(",");
        if (getDestinationIp() != null)
            sb.append("DestinationIp: ").append(getDestinationIp()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: ").append(getDestinationPort()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkInsightsPathRequest == false)
            return false;
        CreateNetworkInsightsPathRequest other = (CreateNetworkInsightsPathRequest) obj;
        if (other.getSourceIp() == null ^ this.getSourceIp() == null)
            return false;
        if (other.getSourceIp() != null && other.getSourceIp().equals(this.getSourceIp()) == false)
            return false;
        if (other.getDestinationIp() == null ^ this.getDestinationIp() == null)
            return false;
        if (other.getDestinationIp() != null && other.getDestinationIp().equals(this.getDestinationIp()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getDestinationPort() == null ^ this.getDestinationPort() == null)
            return false;
        if (other.getDestinationPort() != null && other.getDestinationPort().equals(this.getDestinationPort()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceIp() == null) ? 0 : getSourceIp().hashCode());
        hashCode = prime * hashCode + ((getDestinationIp() == null) ? 0 : getDestinationIp().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkInsightsPathRequest clone() {
        return (CreateNetworkInsightsPathRequest) super.clone();
    }
}
