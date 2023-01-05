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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateVpcConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the VPC connector.
     * </p>
     */
    private String vpcConnectorName;
    /**
     * <p>
     * A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC.
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
     * </p>
     * <note>
     * <p>
     * App Runner currently only provides support for IPv4.
     * </p>
     * </note>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * A list of IDs of security groups that App Runner should use for access to Amazon Web Services resources under the
     * specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A name for the VPC connector.
     * </p>
     * 
     * @param vpcConnectorName
     *        A name for the VPC connector.
     */

    public void setVpcConnectorName(String vpcConnectorName) {
        this.vpcConnectorName = vpcConnectorName;
    }

    /**
     * <p>
     * A name for the VPC connector.
     * </p>
     * 
     * @return A name for the VPC connector.
     */

    public String getVpcConnectorName() {
        return this.vpcConnectorName;
    }

    /**
     * <p>
     * A name for the VPC connector.
     * </p>
     * 
     * @param vpcConnectorName
     *        A name for the VPC connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectorRequest withVpcConnectorName(String vpcConnectorName) {
        setVpcConnectorName(vpcConnectorName);
        return this;
    }

    /**
     * <p>
     * A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC.
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
     * </p>
     * <note>
     * <p>
     * App Runner currently only provides support for IPv4.
     * </p>
     * </note>
     * 
     * @return A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon
     *         VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets
     *         you specify.</p> <note>
     *         <p>
     *         App Runner currently only provides support for IPv4.
     *         </p>
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC.
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
     * </p>
     * <note>
     * <p>
     * App Runner currently only provides support for IPv4.
     * </p>
     * </note>
     * 
     * @param subnets
     *        A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon
     *        VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets
     *        you specify.</p> <note>
     *        <p>
     *        App Runner currently only provides support for IPv4.
     *        </p>
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC.
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
     * </p>
     * <note>
     * <p>
     * App Runner currently only provides support for IPv4.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon
     *        VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets
     *        you specify.</p> <note>
     *        <p>
     *        App Runner currently only provides support for IPv4.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectorRequest withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC.
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
     * </p>
     * <note>
     * <p>
     * App Runner currently only provides support for IPv4.
     * </p>
     * </note>
     * 
     * @param subnets
     *        A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon
     *        VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets
     *        you specify.</p> <note>
     *        <p>
     *        App Runner currently only provides support for IPv4.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectorRequest withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * A list of IDs of security groups that App Runner should use for access to Amazon Web Services resources under the
     * specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     * </p>
     * 
     * @return A list of IDs of security groups that App Runner should use for access to Amazon Web Services resources
     *         under the specified subnets. If not specified, App Runner uses the default security group of the Amazon
     *         VPC. The default security group allows all outbound traffic.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * A list of IDs of security groups that App Runner should use for access to Amazon Web Services resources under the
     * specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     * </p>
     * 
     * @param securityGroups
     *        A list of IDs of security groups that App Runner should use for access to Amazon Web Services resources
     *        under the specified subnets. If not specified, App Runner uses the default security group of the Amazon
     *        VPC. The default security group allows all outbound traffic.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * A list of IDs of security groups that App Runner should use for access to Amazon Web Services resources under the
     * specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list of IDs of security groups that App Runner should use for access to Amazon Web Services resources
     *        under the specified subnets. If not specified, App Runner uses the default security group of the Amazon
     *        VPC. The default security group allows all outbound traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectorRequest withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs of security groups that App Runner should use for access to Amazon Web Services resources under the
     * specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     * </p>
     * 
     * @param securityGroups
     *        A list of IDs of security groups that App Runner should use for access to Amazon Web Services resources
     *        under the specified subnets. If not specified, App Runner uses the default security group of the Amazon
     *        VPC. The default security group allows all outbound traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectorRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value pair.
     * </p>
     * 
     * @return A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value
     *         pair.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value
     *        pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value
     *        pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectorRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value
     *        pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectorRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getVpcConnectorName() != null)
            sb.append("VpcConnectorName: ").append(getVpcConnectorName()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcConnectorRequest == false)
            return false;
        CreateVpcConnectorRequest other = (CreateVpcConnectorRequest) obj;
        if (other.getVpcConnectorName() == null ^ this.getVpcConnectorName() == null)
            return false;
        if (other.getVpcConnectorName() != null && other.getVpcConnectorName().equals(this.getVpcConnectorName()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcConnectorName() == null) ? 0 : getVpcConnectorName().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcConnectorRequest clone() {
        return (CreateVpcConnectorRequest) super.clone();
    }

}
