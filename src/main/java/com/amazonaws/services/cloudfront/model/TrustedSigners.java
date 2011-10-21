/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

/**
 * <p>
 * The trusted signers of the URL.
 * </p>
 */
public class TrustedSigners {

    /**
     * Include this empty element if you want to give your own AWS account
     * permission to create signed URLs.
     */
    private String self;

    /**
     * Specifies an AWS account that can create signed URLs. Remove the
     * dashes. You can specify up to five accounts, each with its own
     * AwsAccountNumber element.
     */
    private java.util.List<String> awsAccountNumbers;

    /**
     * Default constructor for a new TrustedSigners object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public TrustedSigners() {}
    
    /**
     * Constructs a new TrustedSigners object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param awsAccountNumbers Specifies an AWS account that can create
     * signed URLs. Remove the dashes. You can specify up to five accounts,
     * each with its own AwsAccountNumber element.
     */
    public TrustedSigners(java.util.List<String> awsAccountNumbers) {
        this.awsAccountNumbers = awsAccountNumbers;
    }
    
    /**
     * Include this empty element if you want to give your own AWS account
     * permission to create signed URLs.
     *
     * @return Include this empty element if you want to give your own AWS account
     *         permission to create signed URLs.
     */
    public String getSelf() {
        return self;
    }
    
    /**
     * Include this empty element if you want to give your own AWS account
     * permission to create signed URLs.
     *
     * @param self Include this empty element if you want to give your own AWS account
     *         permission to create signed URLs.
     */
    public void setSelf(String self) {
        this.self = self;
    }
    
    /**
     * Include this empty element if you want to give your own AWS account
     * permission to create signed URLs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param self Include this empty element if you want to give your own AWS account
     *         permission to create signed URLs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TrustedSigners withSelf(String self) {
        this.self = self;
        return this;
    }
    
    
    /**
     * Specifies an AWS account that can create signed URLs. Remove the
     * dashes. You can specify up to five accounts, each with its own
     * AwsAccountNumber element.
     *
     * @return Specifies an AWS account that can create signed URLs. Remove the
     *         dashes. You can specify up to five accounts, each with its own
     *         AwsAccountNumber element.
     */
    public java.util.List<String> getAwsAccountNumbers() {
        
        if (awsAccountNumbers == null) {
            awsAccountNumbers = new java.util.ArrayList<String>();
        }
        return awsAccountNumbers;
    }
    
    /**
     * Specifies an AWS account that can create signed URLs. Remove the
     * dashes. You can specify up to five accounts, each with its own
     * AwsAccountNumber element.
     *
     * @param awsAccountNumbers Specifies an AWS account that can create signed URLs. Remove the
     *         dashes. You can specify up to five accounts, each with its own
     *         AwsAccountNumber element.
     */
    public void setAwsAccountNumbers(java.util.Collection<String> awsAccountNumbers) {
        java.util.List<String> awsAccountNumbersCopy = new java.util.ArrayList<String>();
        if (awsAccountNumbers != null) {
            awsAccountNumbersCopy.addAll(awsAccountNumbers);
        }
        this.awsAccountNumbers = awsAccountNumbersCopy;
    }
    
    /**
     * Specifies an AWS account that can create signed URLs. Remove the
     * dashes. You can specify up to five accounts, each with its own
     * AwsAccountNumber element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param awsAccountNumbers Specifies an AWS account that can create signed URLs. Remove the
     *         dashes. You can specify up to five accounts, each with its own
     *         AwsAccountNumber element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TrustedSigners withAwsAccountNumbers(String... awsAccountNumbers) {
        if (getAwsAccountNumbers() == null) setAwsAccountNumbers(new java.util.ArrayList<String>());
        for (String value : awsAccountNumbers) {
            getAwsAccountNumbers().add(value);
        }
        return this;
    }
    
    /**
     * Specifies an AWS account that can create signed URLs. Remove the
     * dashes. You can specify up to five accounts, each with its own
     * AwsAccountNumber element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param awsAccountNumbers Specifies an AWS account that can create signed URLs. Remove the
     *         dashes. You can specify up to five accounts, each with its own
     *         AwsAccountNumber element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TrustedSigners withAwsAccountNumbers(java.util.Collection<String> awsAccountNumbers) {
        java.util.List<String> awsAccountNumbersCopy = new java.util.ArrayList<String>();
        if (awsAccountNumbers != null) {
            awsAccountNumbersCopy.addAll(awsAccountNumbers);
        }
        this.awsAccountNumbers = awsAccountNumbersCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("Self: " + self + ", ");
        sb.append("AwsAccountNumbers: " + awsAccountNumbers + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    