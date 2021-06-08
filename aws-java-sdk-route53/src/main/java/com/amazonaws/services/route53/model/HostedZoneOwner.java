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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that identifies a hosted zone that a specified Amazon VPC is associated with and the owner of the
 * hosted zone. If there is a value for <code>OwningAccount</code>, there is no value for <code>OwningService</code>,
 * and vice versa.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/HostedZoneOwner" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostedZoneOwner implements Serializable, Cloneable {

    /**
     * <p>
     * If the hosted zone was created by an AWS account, or was created by an AWS service that creates hosted zones
     * using the current account, <code>OwningAccount</code> contains the account ID of that account. For example, when
     * you use AWS Cloud Map to create a hosted zone, Cloud Map creates the hosted zone using the current AWS account.
     * </p>
     */
    private String owningAccount;
    /**
     * <p>
     * If an AWS service uses its own account to create a hosted zone and associate the specified VPC with that hosted
     * zone, <code>OwningService</code> contains an abbreviation that identifies the service. For example, if Amazon
     * Elastic File System (Amazon EFS) created a hosted zone and associated a VPC with the hosted zone, the value of
     * <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     * </p>
     */
    private String owningService;

    /**
     * <p>
     * If the hosted zone was created by an AWS account, or was created by an AWS service that creates hosted zones
     * using the current account, <code>OwningAccount</code> contains the account ID of that account. For example, when
     * you use AWS Cloud Map to create a hosted zone, Cloud Map creates the hosted zone using the current AWS account.
     * </p>
     * 
     * @param owningAccount
     *        If the hosted zone was created by an AWS account, or was created by an AWS service that creates hosted
     *        zones using the current account, <code>OwningAccount</code> contains the account ID of that account. For
     *        example, when you use AWS Cloud Map to create a hosted zone, Cloud Map creates the hosted zone using the
     *        current AWS account.
     */

    public void setOwningAccount(String owningAccount) {
        this.owningAccount = owningAccount;
    }

    /**
     * <p>
     * If the hosted zone was created by an AWS account, or was created by an AWS service that creates hosted zones
     * using the current account, <code>OwningAccount</code> contains the account ID of that account. For example, when
     * you use AWS Cloud Map to create a hosted zone, Cloud Map creates the hosted zone using the current AWS account.
     * </p>
     * 
     * @return If the hosted zone was created by an AWS account, or was created by an AWS service that creates hosted
     *         zones using the current account, <code>OwningAccount</code> contains the account ID of that account. For
     *         example, when you use AWS Cloud Map to create a hosted zone, Cloud Map creates the hosted zone using the
     *         current AWS account.
     */

    public String getOwningAccount() {
        return this.owningAccount;
    }

    /**
     * <p>
     * If the hosted zone was created by an AWS account, or was created by an AWS service that creates hosted zones
     * using the current account, <code>OwningAccount</code> contains the account ID of that account. For example, when
     * you use AWS Cloud Map to create a hosted zone, Cloud Map creates the hosted zone using the current AWS account.
     * </p>
     * 
     * @param owningAccount
     *        If the hosted zone was created by an AWS account, or was created by an AWS service that creates hosted
     *        zones using the current account, <code>OwningAccount</code> contains the account ID of that account. For
     *        example, when you use AWS Cloud Map to create a hosted zone, Cloud Map creates the hosted zone using the
     *        current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZoneOwner withOwningAccount(String owningAccount) {
        setOwningAccount(owningAccount);
        return this;
    }

    /**
     * <p>
     * If an AWS service uses its own account to create a hosted zone and associate the specified VPC with that hosted
     * zone, <code>OwningService</code> contains an abbreviation that identifies the service. For example, if Amazon
     * Elastic File System (Amazon EFS) created a hosted zone and associated a VPC with the hosted zone, the value of
     * <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     * </p>
     * 
     * @param owningService
     *        If an AWS service uses its own account to create a hosted zone and associate the specified VPC with that
     *        hosted zone, <code>OwningService</code> contains an abbreviation that identifies the service. For example,
     *        if Amazon Elastic File System (Amazon EFS) created a hosted zone and associated a VPC with the hosted
     *        zone, the value of <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     */

    public void setOwningService(String owningService) {
        this.owningService = owningService;
    }

    /**
     * <p>
     * If an AWS service uses its own account to create a hosted zone and associate the specified VPC with that hosted
     * zone, <code>OwningService</code> contains an abbreviation that identifies the service. For example, if Amazon
     * Elastic File System (Amazon EFS) created a hosted zone and associated a VPC with the hosted zone, the value of
     * <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     * </p>
     * 
     * @return If an AWS service uses its own account to create a hosted zone and associate the specified VPC with that
     *         hosted zone, <code>OwningService</code> contains an abbreviation that identifies the service. For
     *         example, if Amazon Elastic File System (Amazon EFS) created a hosted zone and associated a VPC with the
     *         hosted zone, the value of <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     */

    public String getOwningService() {
        return this.owningService;
    }

    /**
     * <p>
     * If an AWS service uses its own account to create a hosted zone and associate the specified VPC with that hosted
     * zone, <code>OwningService</code> contains an abbreviation that identifies the service. For example, if Amazon
     * Elastic File System (Amazon EFS) created a hosted zone and associated a VPC with the hosted zone, the value of
     * <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     * </p>
     * 
     * @param owningService
     *        If an AWS service uses its own account to create a hosted zone and associate the specified VPC with that
     *        hosted zone, <code>OwningService</code> contains an abbreviation that identifies the service. For example,
     *        if Amazon Elastic File System (Amazon EFS) created a hosted zone and associated a VPC with the hosted
     *        zone, the value of <code>OwningService</code> is <code>efs.amazonaws.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZoneOwner withOwningService(String owningService) {
        setOwningService(owningService);
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
        if (getOwningAccount() != null)
            sb.append("OwningAccount: ").append(getOwningAccount()).append(",");
        if (getOwningService() != null)
            sb.append("OwningService: ").append(getOwningService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostedZoneOwner == false)
            return false;
        HostedZoneOwner other = (HostedZoneOwner) obj;
        if (other.getOwningAccount() == null ^ this.getOwningAccount() == null)
            return false;
        if (other.getOwningAccount() != null && other.getOwningAccount().equals(this.getOwningAccount()) == false)
            return false;
        if (other.getOwningService() == null ^ this.getOwningService() == null)
            return false;
        if (other.getOwningService() != null && other.getOwningService().equals(this.getOwningService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwningAccount() == null) ? 0 : getOwningAccount().hashCode());
        hashCode = prime * hashCode + ((getOwningService() == null) ? 0 : getOwningService().hashCode());
        return hashCode;
    }

    @Override
    public HostedZoneOwner clone() {
        try {
            return (HostedZoneOwner) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
