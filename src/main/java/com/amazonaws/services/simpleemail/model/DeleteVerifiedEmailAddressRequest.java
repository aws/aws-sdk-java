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
package com.amazonaws.services.simpleemail.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#deleteVerifiedEmailAddress(DeleteVerifiedEmailAddressRequest) DeleteVerifiedEmailAddress operation}.
 * <p>
 * Deletes the specified email address from the list of verified
 * addresses.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#deleteVerifiedEmailAddress(DeleteVerifiedEmailAddressRequest)
 */
public class DeleteVerifiedEmailAddressRequest extends AmazonWebServiceRequest {

    /**
     * An email address to be removed from the list of verified addreses.
     */
    private String emailAddress;

    /**
     * An email address to be removed from the list of verified addreses.
     *
     * @return An email address to be removed from the list of verified addreses.
     */
    public String getEmailAddress() {
        return emailAddress;
    }
    
    /**
     * An email address to be removed from the list of verified addreses.
     *
     * @param emailAddress An email address to be removed from the list of verified addreses.
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    /**
     * An email address to be removed from the list of verified addreses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param emailAddress An email address to be removed from the list of verified addreses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteVerifiedEmailAddressRequest withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
        sb.append("EmailAddress: " + emailAddress + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    