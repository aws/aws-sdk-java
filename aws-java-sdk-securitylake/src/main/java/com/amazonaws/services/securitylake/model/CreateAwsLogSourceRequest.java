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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateAwsLogSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAwsLogSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Enables data collection from specific Amazon Web Services sources in all specific accounts and specific Regions.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, java.util.List<String>>> enableAllDimensions;
    /**
     * <p>
     * Enables data collection from all Amazon Web Services sources in specific accounts or Regions.
     * </p>
     */
    private java.util.List<String> enableSingleDimension;
    /**
     * <p>
     * Enables data collection from specific Amazon Web Services sources in specific accounts or Regions.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> enableTwoDimensions;
    /**
     * <p>
     * Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member account.
     * </p>
     */
    private java.util.List<String> inputOrder;

    /**
     * <p>
     * Enables data collection from specific Amazon Web Services sources in all specific accounts and specific Regions.
     * </p>
     * 
     * @return Enables data collection from specific Amazon Web Services sources in all specific accounts and specific
     *         Regions.
     */

    public java.util.Map<String, java.util.Map<String, java.util.List<String>>> getEnableAllDimensions() {
        return enableAllDimensions;
    }

    /**
     * <p>
     * Enables data collection from specific Amazon Web Services sources in all specific accounts and specific Regions.
     * </p>
     * 
     * @param enableAllDimensions
     *        Enables data collection from specific Amazon Web Services sources in all specific accounts and specific
     *        Regions.
     */

    public void setEnableAllDimensions(java.util.Map<String, java.util.Map<String, java.util.List<String>>> enableAllDimensions) {
        this.enableAllDimensions = enableAllDimensions;
    }

    /**
     * <p>
     * Enables data collection from specific Amazon Web Services sources in all specific accounts and specific Regions.
     * </p>
     * 
     * @param enableAllDimensions
     *        Enables data collection from specific Amazon Web Services sources in all specific accounts and specific
     *        Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceRequest withEnableAllDimensions(java.util.Map<String, java.util.Map<String, java.util.List<String>>> enableAllDimensions) {
        setEnableAllDimensions(enableAllDimensions);
        return this;
    }

    /**
     * Add a single EnableAllDimensions entry
     *
     * @see CreateAwsLogSourceRequest#withEnableAllDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceRequest addEnableAllDimensionsEntry(String key, java.util.Map<String, java.util.List<String>> value) {
        if (null == this.enableAllDimensions) {
            this.enableAllDimensions = new java.util.HashMap<String, java.util.Map<String, java.util.List<String>>>();
        }
        if (this.enableAllDimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.enableAllDimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnableAllDimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceRequest clearEnableAllDimensionsEntries() {
        this.enableAllDimensions = null;
        return this;
    }

    /**
     * <p>
     * Enables data collection from all Amazon Web Services sources in specific accounts or Regions.
     * </p>
     * 
     * @return Enables data collection from all Amazon Web Services sources in specific accounts or Regions.
     */

    public java.util.List<String> getEnableSingleDimension() {
        return enableSingleDimension;
    }

    /**
     * <p>
     * Enables data collection from all Amazon Web Services sources in specific accounts or Regions.
     * </p>
     * 
     * @param enableSingleDimension
     *        Enables data collection from all Amazon Web Services sources in specific accounts or Regions.
     */

    public void setEnableSingleDimension(java.util.Collection<String> enableSingleDimension) {
        if (enableSingleDimension == null) {
            this.enableSingleDimension = null;
            return;
        }

        this.enableSingleDimension = new java.util.ArrayList<String>(enableSingleDimension);
    }

    /**
     * <p>
     * Enables data collection from all Amazon Web Services sources in specific accounts or Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableSingleDimension(java.util.Collection)} or
     * {@link #withEnableSingleDimension(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableSingleDimension
     *        Enables data collection from all Amazon Web Services sources in specific accounts or Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceRequest withEnableSingleDimension(String... enableSingleDimension) {
        if (this.enableSingleDimension == null) {
            setEnableSingleDimension(new java.util.ArrayList<String>(enableSingleDimension.length));
        }
        for (String ele : enableSingleDimension) {
            this.enableSingleDimension.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Enables data collection from all Amazon Web Services sources in specific accounts or Regions.
     * </p>
     * 
     * @param enableSingleDimension
     *        Enables data collection from all Amazon Web Services sources in specific accounts or Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceRequest withEnableSingleDimension(java.util.Collection<String> enableSingleDimension) {
        setEnableSingleDimension(enableSingleDimension);
        return this;
    }

    /**
     * <p>
     * Enables data collection from specific Amazon Web Services sources in specific accounts or Regions.
     * </p>
     * 
     * @return Enables data collection from specific Amazon Web Services sources in specific accounts or Regions.
     */

    public java.util.Map<String, java.util.List<String>> getEnableTwoDimensions() {
        return enableTwoDimensions;
    }

    /**
     * <p>
     * Enables data collection from specific Amazon Web Services sources in specific accounts or Regions.
     * </p>
     * 
     * @param enableTwoDimensions
     *        Enables data collection from specific Amazon Web Services sources in specific accounts or Regions.
     */

    public void setEnableTwoDimensions(java.util.Map<String, java.util.List<String>> enableTwoDimensions) {
        this.enableTwoDimensions = enableTwoDimensions;
    }

    /**
     * <p>
     * Enables data collection from specific Amazon Web Services sources in specific accounts or Regions.
     * </p>
     * 
     * @param enableTwoDimensions
     *        Enables data collection from specific Amazon Web Services sources in specific accounts or Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceRequest withEnableTwoDimensions(java.util.Map<String, java.util.List<String>> enableTwoDimensions) {
        setEnableTwoDimensions(enableTwoDimensions);
        return this;
    }

    /**
     * Add a single EnableTwoDimensions entry
     *
     * @see CreateAwsLogSourceRequest#withEnableTwoDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceRequest addEnableTwoDimensionsEntry(String key, java.util.List<String> value) {
        if (null == this.enableTwoDimensions) {
            this.enableTwoDimensions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.enableTwoDimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.enableTwoDimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnableTwoDimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceRequest clearEnableTwoDimensionsEntries() {
        this.enableTwoDimensions = null;
        return this;
    }

    /**
     * <p>
     * Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member account.
     * </p>
     * 
     * @return Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member
     *         account.
     * @see Dimension
     */

    public java.util.List<String> getInputOrder() {
        return inputOrder;
    }

    /**
     * <p>
     * Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member account.
     * </p>
     * 
     * @param inputOrder
     *        Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member
     *        account.
     * @see Dimension
     */

    public void setInputOrder(java.util.Collection<String> inputOrder) {
        if (inputOrder == null) {
            this.inputOrder = null;
            return;
        }

        this.inputOrder = new java.util.ArrayList<String>(inputOrder);
    }

    /**
     * <p>
     * Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputOrder(java.util.Collection)} or {@link #withInputOrder(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputOrder
     *        Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public CreateAwsLogSourceRequest withInputOrder(String... inputOrder) {
        if (this.inputOrder == null) {
            setInputOrder(new java.util.ArrayList<String>(inputOrder.length));
        }
        for (String ele : inputOrder) {
            this.inputOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member account.
     * </p>
     * 
     * @param inputOrder
     *        Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public CreateAwsLogSourceRequest withInputOrder(java.util.Collection<String> inputOrder) {
        setInputOrder(inputOrder);
        return this;
    }

    /**
     * <p>
     * Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member account.
     * </p>
     * 
     * @param inputOrder
     *        Specifies the input order to enable dimensions in Security Lake, namely Region, source type, and member
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Dimension
     */

    public CreateAwsLogSourceRequest withInputOrder(Dimension... inputOrder) {
        java.util.ArrayList<String> inputOrderCopy = new java.util.ArrayList<String>(inputOrder.length);
        for (Dimension value : inputOrder) {
            inputOrderCopy.add(value.toString());
        }
        if (getInputOrder() == null) {
            setInputOrder(inputOrderCopy);
        } else {
            getInputOrder().addAll(inputOrderCopy);
        }
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
        if (getEnableAllDimensions() != null)
            sb.append("EnableAllDimensions: ").append(getEnableAllDimensions()).append(",");
        if (getEnableSingleDimension() != null)
            sb.append("EnableSingleDimension: ").append(getEnableSingleDimension()).append(",");
        if (getEnableTwoDimensions() != null)
            sb.append("EnableTwoDimensions: ").append(getEnableTwoDimensions()).append(",");
        if (getInputOrder() != null)
            sb.append("InputOrder: ").append(getInputOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAwsLogSourceRequest == false)
            return false;
        CreateAwsLogSourceRequest other = (CreateAwsLogSourceRequest) obj;
        if (other.getEnableAllDimensions() == null ^ this.getEnableAllDimensions() == null)
            return false;
        if (other.getEnableAllDimensions() != null && other.getEnableAllDimensions().equals(this.getEnableAllDimensions()) == false)
            return false;
        if (other.getEnableSingleDimension() == null ^ this.getEnableSingleDimension() == null)
            return false;
        if (other.getEnableSingleDimension() != null && other.getEnableSingleDimension().equals(this.getEnableSingleDimension()) == false)
            return false;
        if (other.getEnableTwoDimensions() == null ^ this.getEnableTwoDimensions() == null)
            return false;
        if (other.getEnableTwoDimensions() != null && other.getEnableTwoDimensions().equals(this.getEnableTwoDimensions()) == false)
            return false;
        if (other.getInputOrder() == null ^ this.getInputOrder() == null)
            return false;
        if (other.getInputOrder() != null && other.getInputOrder().equals(this.getInputOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableAllDimensions() == null) ? 0 : getEnableAllDimensions().hashCode());
        hashCode = prime * hashCode + ((getEnableSingleDimension() == null) ? 0 : getEnableSingleDimension().hashCode());
        hashCode = prime * hashCode + ((getEnableTwoDimensions() == null) ? 0 : getEnableTwoDimensions().hashCode());
        hashCode = prime * hashCode + ((getInputOrder() == null) ? 0 : getInputOrder().hashCode());
        return hashCode;
    }

    @Override
    public CreateAwsLogSourceRequest clone() {
        return (CreateAwsLogSourceRequest) super.clone();
    }

}
