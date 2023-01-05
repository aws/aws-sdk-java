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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutRegistryScanningConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRegistryScanningConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The scanning type to set for the registry.
     * </p>
     * <p>
     * When a registry scanning configuration is not defined, by default the <code>BASIC</code> scan type is used. When
     * basic scanning is used, you may specify filters to determine which individual repositories, or all repositories,
     * are scanned when new images are pushed to those repositories. Alternatively, you can do manual scans of images
     * with basic scanning.
     * </p>
     * <p>
     * When the <code>ENHANCED</code> scan type is set, Amazon Inspector provides automated vulnerability scanning. You
     * may choose between continuous scanning or scan on push and you may specify filters to determine which individual
     * repositories, or all repositories, are scanned.
     * </p>
     */
    private String scanType;
    /**
     * <p>
     * The scanning rules to use for the registry. A scanning rule is used to determine which repository filters are
     * used and at what frequency scanning will occur.
     * </p>
     */
    private java.util.List<RegistryScanningRule> rules;

    /**
     * <p>
     * The scanning type to set for the registry.
     * </p>
     * <p>
     * When a registry scanning configuration is not defined, by default the <code>BASIC</code> scan type is used. When
     * basic scanning is used, you may specify filters to determine which individual repositories, or all repositories,
     * are scanned when new images are pushed to those repositories. Alternatively, you can do manual scans of images
     * with basic scanning.
     * </p>
     * <p>
     * When the <code>ENHANCED</code> scan type is set, Amazon Inspector provides automated vulnerability scanning. You
     * may choose between continuous scanning or scan on push and you may specify filters to determine which individual
     * repositories, or all repositories, are scanned.
     * </p>
     * 
     * @param scanType
     *        The scanning type to set for the registry.</p>
     *        <p>
     *        When a registry scanning configuration is not defined, by default the <code>BASIC</code> scan type is
     *        used. When basic scanning is used, you may specify filters to determine which individual repositories, or
     *        all repositories, are scanned when new images are pushed to those repositories. Alternatively, you can do
     *        manual scans of images with basic scanning.
     *        </p>
     *        <p>
     *        When the <code>ENHANCED</code> scan type is set, Amazon Inspector provides automated vulnerability
     *        scanning. You may choose between continuous scanning or scan on push and you may specify filters to
     *        determine which individual repositories, or all repositories, are scanned.
     * @see ScanType
     */

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * <p>
     * The scanning type to set for the registry.
     * </p>
     * <p>
     * When a registry scanning configuration is not defined, by default the <code>BASIC</code> scan type is used. When
     * basic scanning is used, you may specify filters to determine which individual repositories, or all repositories,
     * are scanned when new images are pushed to those repositories. Alternatively, you can do manual scans of images
     * with basic scanning.
     * </p>
     * <p>
     * When the <code>ENHANCED</code> scan type is set, Amazon Inspector provides automated vulnerability scanning. You
     * may choose between continuous scanning or scan on push and you may specify filters to determine which individual
     * repositories, or all repositories, are scanned.
     * </p>
     * 
     * @return The scanning type to set for the registry.</p>
     *         <p>
     *         When a registry scanning configuration is not defined, by default the <code>BASIC</code> scan type is
     *         used. When basic scanning is used, you may specify filters to determine which individual repositories, or
     *         all repositories, are scanned when new images are pushed to those repositories. Alternatively, you can do
     *         manual scans of images with basic scanning.
     *         </p>
     *         <p>
     *         When the <code>ENHANCED</code> scan type is set, Amazon Inspector provides automated vulnerability
     *         scanning. You may choose between continuous scanning or scan on push and you may specify filters to
     *         determine which individual repositories, or all repositories, are scanned.
     * @see ScanType
     */

    public String getScanType() {
        return this.scanType;
    }

    /**
     * <p>
     * The scanning type to set for the registry.
     * </p>
     * <p>
     * When a registry scanning configuration is not defined, by default the <code>BASIC</code> scan type is used. When
     * basic scanning is used, you may specify filters to determine which individual repositories, or all repositories,
     * are scanned when new images are pushed to those repositories. Alternatively, you can do manual scans of images
     * with basic scanning.
     * </p>
     * <p>
     * When the <code>ENHANCED</code> scan type is set, Amazon Inspector provides automated vulnerability scanning. You
     * may choose between continuous scanning or scan on push and you may specify filters to determine which individual
     * repositories, or all repositories, are scanned.
     * </p>
     * 
     * @param scanType
     *        The scanning type to set for the registry.</p>
     *        <p>
     *        When a registry scanning configuration is not defined, by default the <code>BASIC</code> scan type is
     *        used. When basic scanning is used, you may specify filters to determine which individual repositories, or
     *        all repositories, are scanned when new images are pushed to those repositories. Alternatively, you can do
     *        manual scans of images with basic scanning.
     *        </p>
     *        <p>
     *        When the <code>ENHANCED</code> scan type is set, Amazon Inspector provides automated vulnerability
     *        scanning. You may choose between continuous scanning or scan on push and you may specify filters to
     *        determine which individual repositories, or all repositories, are scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanType
     */

    public PutRegistryScanningConfigurationRequest withScanType(String scanType) {
        setScanType(scanType);
        return this;
    }

    /**
     * <p>
     * The scanning type to set for the registry.
     * </p>
     * <p>
     * When a registry scanning configuration is not defined, by default the <code>BASIC</code> scan type is used. When
     * basic scanning is used, you may specify filters to determine which individual repositories, or all repositories,
     * are scanned when new images are pushed to those repositories. Alternatively, you can do manual scans of images
     * with basic scanning.
     * </p>
     * <p>
     * When the <code>ENHANCED</code> scan type is set, Amazon Inspector provides automated vulnerability scanning. You
     * may choose between continuous scanning or scan on push and you may specify filters to determine which individual
     * repositories, or all repositories, are scanned.
     * </p>
     * 
     * @param scanType
     *        The scanning type to set for the registry.</p>
     *        <p>
     *        When a registry scanning configuration is not defined, by default the <code>BASIC</code> scan type is
     *        used. When basic scanning is used, you may specify filters to determine which individual repositories, or
     *        all repositories, are scanned when new images are pushed to those repositories. Alternatively, you can do
     *        manual scans of images with basic scanning.
     *        </p>
     *        <p>
     *        When the <code>ENHANCED</code> scan type is set, Amazon Inspector provides automated vulnerability
     *        scanning. You may choose between continuous scanning or scan on push and you may specify filters to
     *        determine which individual repositories, or all repositories, are scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanType
     */

    public PutRegistryScanningConfigurationRequest withScanType(ScanType scanType) {
        this.scanType = scanType.toString();
        return this;
    }

    /**
     * <p>
     * The scanning rules to use for the registry. A scanning rule is used to determine which repository filters are
     * used and at what frequency scanning will occur.
     * </p>
     * 
     * @return The scanning rules to use for the registry. A scanning rule is used to determine which repository filters
     *         are used and at what frequency scanning will occur.
     */

    public java.util.List<RegistryScanningRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The scanning rules to use for the registry. A scanning rule is used to determine which repository filters are
     * used and at what frequency scanning will occur.
     * </p>
     * 
     * @param rules
     *        The scanning rules to use for the registry. A scanning rule is used to determine which repository filters
     *        are used and at what frequency scanning will occur.
     */

    public void setRules(java.util.Collection<RegistryScanningRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<RegistryScanningRule>(rules);
    }

    /**
     * <p>
     * The scanning rules to use for the registry. A scanning rule is used to determine which repository filters are
     * used and at what frequency scanning will occur.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The scanning rules to use for the registry. A scanning rule is used to determine which repository filters
     *        are used and at what frequency scanning will occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRegistryScanningConfigurationRequest withRules(RegistryScanningRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<RegistryScanningRule>(rules.length));
        }
        for (RegistryScanningRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scanning rules to use for the registry. A scanning rule is used to determine which repository filters are
     * used and at what frequency scanning will occur.
     * </p>
     * 
     * @param rules
     *        The scanning rules to use for the registry. A scanning rule is used to determine which repository filters
     *        are used and at what frequency scanning will occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRegistryScanningConfigurationRequest withRules(java.util.Collection<RegistryScanningRule> rules) {
        setRules(rules);
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
        if (getScanType() != null)
            sb.append("ScanType: ").append(getScanType()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRegistryScanningConfigurationRequest == false)
            return false;
        PutRegistryScanningConfigurationRequest other = (PutRegistryScanningConfigurationRequest) obj;
        if (other.getScanType() == null ^ this.getScanType() == null)
            return false;
        if (other.getScanType() != null && other.getScanType().equals(this.getScanType()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public PutRegistryScanningConfigurationRequest clone() {
        return (PutRegistryScanningConfigurationRequest) super.clone();
    }

}
