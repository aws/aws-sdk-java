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

/**
 * <p>
 * Describes the Amazon EBS features supported by the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EbsInfo" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsInfo implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized Instances</a>
     * in <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     */
    private String ebsOptimizedSupport;
    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     */
    private String encryptionSupport;

    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized Instances</a>
     * in <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param ebsOptimizedSupport
     *        Indicates that the instance type is Amazon EBS-optimized. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *        Instances</a> in <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @see EbsOptimizedSupport
     */

    public void setEbsOptimizedSupport(String ebsOptimizedSupport) {
        this.ebsOptimizedSupport = ebsOptimizedSupport;
    }

    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized Instances</a>
     * in <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @return Indicates that the instance type is Amazon EBS-optimized. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *         Instances</a> in <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @see EbsOptimizedSupport
     */

    public String getEbsOptimizedSupport() {
        return this.ebsOptimizedSupport;
    }

    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized Instances</a>
     * in <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param ebsOptimizedSupport
     *        Indicates that the instance type is Amazon EBS-optimized. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *        Instances</a> in <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EbsOptimizedSupport
     */

    public EbsInfo withEbsOptimizedSupport(String ebsOptimizedSupport) {
        setEbsOptimizedSupport(ebsOptimizedSupport);
        return this;
    }

    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized Instances</a>
     * in <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * 
     * @param ebsOptimizedSupport
     *        Indicates that the instance type is Amazon EBS-optimized. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon EBS-Optimized
     *        Instances</a> in <i>Amazon EC2 User Guide for Linux Instances</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EbsOptimizedSupport
     */

    public EbsInfo withEbsOptimizedSupport(EbsOptimizedSupport ebsOptimizedSupport) {
        this.ebsOptimizedSupport = ebsOptimizedSupport.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     * 
     * @param encryptionSupport
     *        Indicates whether Amazon EBS encryption is supported.
     * @see EbsEncryptionSupport
     */

    public void setEncryptionSupport(String encryptionSupport) {
        this.encryptionSupport = encryptionSupport;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     * 
     * @return Indicates whether Amazon EBS encryption is supported.
     * @see EbsEncryptionSupport
     */

    public String getEncryptionSupport() {
        return this.encryptionSupport;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     * 
     * @param encryptionSupport
     *        Indicates whether Amazon EBS encryption is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EbsEncryptionSupport
     */

    public EbsInfo withEncryptionSupport(String encryptionSupport) {
        setEncryptionSupport(encryptionSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     * 
     * @param encryptionSupport
     *        Indicates whether Amazon EBS encryption is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EbsEncryptionSupport
     */

    public EbsInfo withEncryptionSupport(EbsEncryptionSupport encryptionSupport) {
        this.encryptionSupport = encryptionSupport.toString();
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
        if (getEbsOptimizedSupport() != null)
            sb.append("EbsOptimizedSupport: ").append(getEbsOptimizedSupport()).append(",");
        if (getEncryptionSupport() != null)
            sb.append("EncryptionSupport: ").append(getEncryptionSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsInfo == false)
            return false;
        EbsInfo other = (EbsInfo) obj;
        if (other.getEbsOptimizedSupport() == null ^ this.getEbsOptimizedSupport() == null)
            return false;
        if (other.getEbsOptimizedSupport() != null && other.getEbsOptimizedSupport().equals(this.getEbsOptimizedSupport()) == false)
            return false;
        if (other.getEncryptionSupport() == null ^ this.getEncryptionSupport() == null)
            return false;
        if (other.getEncryptionSupport() != null && other.getEncryptionSupport().equals(this.getEncryptionSupport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEbsOptimizedSupport() == null) ? 0 : getEbsOptimizedSupport().hashCode());
        hashCode = prime * hashCode + ((getEncryptionSupport() == null) ? 0 : getEncryptionSupport().hashCode());
        return hashCode;
    }

    @Override
    public EbsInfo clone() {
        try {
            return (EbsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
