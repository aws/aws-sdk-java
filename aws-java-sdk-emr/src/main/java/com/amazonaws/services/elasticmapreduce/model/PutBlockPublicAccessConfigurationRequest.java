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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/PutBlockPublicAccessConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBlockPublicAccessConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A configuration for Amazon EMR block public access. The configuration applies to all clusters created in your
     * account for the current Region. The configuration specifies whether block public access is enabled. If block
     * public access is enabled, security groups associated with the cluster cannot have rules that allow inbound
     * traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception using
     * <code>PermittedPublicSecurityGroupRuleRanges</code> in the <code>BlockPublicAccessConfiguration</code>. By
     * default, Port 22 (SSH) is an exception, and public access is allowed on this port. You can change this by
     * updating <code>BlockPublicSecurityGroupRules</code> to remove the exception.
     * </p>
     */
    private BlockPublicAccessConfiguration blockPublicAccessConfiguration;

    /**
     * <p>
     * A configuration for Amazon EMR block public access. The configuration applies to all clusters created in your
     * account for the current Region. The configuration specifies whether block public access is enabled. If block
     * public access is enabled, security groups associated with the cluster cannot have rules that allow inbound
     * traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception using
     * <code>PermittedPublicSecurityGroupRuleRanges</code> in the <code>BlockPublicAccessConfiguration</code>. By
     * default, Port 22 (SSH) is an exception, and public access is allowed on this port. You can change this by
     * updating <code>BlockPublicSecurityGroupRules</code> to remove the exception.
     * </p>
     * 
     * @param blockPublicAccessConfiguration
     *        A configuration for Amazon EMR block public access. The configuration applies to all clusters created in
     *        your account for the current Region. The configuration specifies whether block public access is enabled.
     *        If block public access is enabled, security groups associated with the cluster cannot have rules that
     *        allow inbound traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception using
     *        <code>PermittedPublicSecurityGroupRuleRanges</code> in the <code>BlockPublicAccessConfiguration</code>. By
     *        default, Port 22 (SSH) is an exception, and public access is allowed on this port. You can change this by
     *        updating <code>BlockPublicSecurityGroupRules</code> to remove the exception.
     */

    public void setBlockPublicAccessConfiguration(BlockPublicAccessConfiguration blockPublicAccessConfiguration) {
        this.blockPublicAccessConfiguration = blockPublicAccessConfiguration;
    }

    /**
     * <p>
     * A configuration for Amazon EMR block public access. The configuration applies to all clusters created in your
     * account for the current Region. The configuration specifies whether block public access is enabled. If block
     * public access is enabled, security groups associated with the cluster cannot have rules that allow inbound
     * traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception using
     * <code>PermittedPublicSecurityGroupRuleRanges</code> in the <code>BlockPublicAccessConfiguration</code>. By
     * default, Port 22 (SSH) is an exception, and public access is allowed on this port. You can change this by
     * updating <code>BlockPublicSecurityGroupRules</code> to remove the exception.
     * </p>
     * 
     * @return A configuration for Amazon EMR block public access. The configuration applies to all clusters created in
     *         your account for the current Region. The configuration specifies whether block public access is enabled.
     *         If block public access is enabled, security groups associated with the cluster cannot have rules that
     *         allow inbound traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception
     *         using <code>PermittedPublicSecurityGroupRuleRanges</code> in the
     *         <code>BlockPublicAccessConfiguration</code>. By default, Port 22 (SSH) is an exception, and public access
     *         is allowed on this port. You can change this by updating <code>BlockPublicSecurityGroupRules</code> to
     *         remove the exception.
     */

    public BlockPublicAccessConfiguration getBlockPublicAccessConfiguration() {
        return this.blockPublicAccessConfiguration;
    }

    /**
     * <p>
     * A configuration for Amazon EMR block public access. The configuration applies to all clusters created in your
     * account for the current Region. The configuration specifies whether block public access is enabled. If block
     * public access is enabled, security groups associated with the cluster cannot have rules that allow inbound
     * traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception using
     * <code>PermittedPublicSecurityGroupRuleRanges</code> in the <code>BlockPublicAccessConfiguration</code>. By
     * default, Port 22 (SSH) is an exception, and public access is allowed on this port. You can change this by
     * updating <code>BlockPublicSecurityGroupRules</code> to remove the exception.
     * </p>
     * 
     * @param blockPublicAccessConfiguration
     *        A configuration for Amazon EMR block public access. The configuration applies to all clusters created in
     *        your account for the current Region. The configuration specifies whether block public access is enabled.
     *        If block public access is enabled, security groups associated with the cluster cannot have rules that
     *        allow inbound traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception using
     *        <code>PermittedPublicSecurityGroupRuleRanges</code> in the <code>BlockPublicAccessConfiguration</code>. By
     *        default, Port 22 (SSH) is an exception, and public access is allowed on this port. You can change this by
     *        updating <code>BlockPublicSecurityGroupRules</code> to remove the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBlockPublicAccessConfigurationRequest withBlockPublicAccessConfiguration(BlockPublicAccessConfiguration blockPublicAccessConfiguration) {
        setBlockPublicAccessConfiguration(blockPublicAccessConfiguration);
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
        if (getBlockPublicAccessConfiguration() != null)
            sb.append("BlockPublicAccessConfiguration: ").append(getBlockPublicAccessConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBlockPublicAccessConfigurationRequest == false)
            return false;
        PutBlockPublicAccessConfigurationRequest other = (PutBlockPublicAccessConfigurationRequest) obj;
        if (other.getBlockPublicAccessConfiguration() == null ^ this.getBlockPublicAccessConfiguration() == null)
            return false;
        if (other.getBlockPublicAccessConfiguration() != null
                && other.getBlockPublicAccessConfiguration().equals(this.getBlockPublicAccessConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockPublicAccessConfiguration() == null) ? 0 : getBlockPublicAccessConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutBlockPublicAccessConfigurationRequest clone() {
        return (PutBlockPublicAccessConfigurationRequest) super.clone();
    }

}
