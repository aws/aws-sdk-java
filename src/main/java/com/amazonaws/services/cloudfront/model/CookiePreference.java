/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * <p>
 * A complex type that specifies the cookie preferences associated with this cache behavior.
 * </p>
 */
public class CookiePreference implements Serializable {

    /**
     * Use this element to specify whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You
     * can specify all, none or whitelist. If you choose All, CloudFront
     * forwards all cookies regardless of how many your application uses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, whitelist, all
     */
    private String forward;

    /**
     * A complex type that specifies the whitelisted cookies, if any, that
     * you want CloudFront to forward to your origin that is associated with
     * this cache behavior.
     */
    private CookieNames whitelistedNames;

    /**
     * Use this element to specify whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You
     * can specify all, none or whitelist. If you choose All, CloudFront
     * forwards all cookies regardless of how many your application uses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, whitelist, all
     *
     * @return Use this element to specify whether you want CloudFront to forward
     *         cookies to the origin that is associated with this cache behavior. You
     *         can specify all, none or whitelist. If you choose All, CloudFront
     *         forwards all cookies regardless of how many your application uses.
     *
     * @see ItemSelection
     */
    public String getForward() {
        return forward;
    }
    
    /**
     * Use this element to specify whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You
     * can specify all, none or whitelist. If you choose All, CloudFront
     * forwards all cookies regardless of how many your application uses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, whitelist, all
     *
     * @param forward Use this element to specify whether you want CloudFront to forward
     *         cookies to the origin that is associated with this cache behavior. You
     *         can specify all, none or whitelist. If you choose All, CloudFront
     *         forwards all cookies regardless of how many your application uses.
     *
     * @see ItemSelection
     */
    public void setForward(String forward) {
        this.forward = forward;
    }
    
    /**
     * Use this element to specify whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You
     * can specify all, none or whitelist. If you choose All, CloudFront
     * forwards all cookies regardless of how many your application uses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, whitelist, all
     *
     * @param forward Use this element to specify whether you want CloudFront to forward
     *         cookies to the origin that is associated with this cache behavior. You
     *         can specify all, none or whitelist. If you choose All, CloudFront
     *         forwards all cookies regardless of how many your application uses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ItemSelection
     */
    public CookiePreference withForward(String forward) {
        this.forward = forward;
        return this;
    }

    /**
     * Use this element to specify whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You
     * can specify all, none or whitelist. If you choose All, CloudFront
     * forwards all cookies regardless of how many your application uses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, whitelist, all
     *
     * @param forward Use this element to specify whether you want CloudFront to forward
     *         cookies to the origin that is associated with this cache behavior. You
     *         can specify all, none or whitelist. If you choose All, CloudFront
     *         forwards all cookies regardless of how many your application uses.
     *
     * @see ItemSelection
     */
    public void setForward(ItemSelection forward) {
        this.forward = forward.toString();
    }
    
    /**
     * Use this element to specify whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You
     * can specify all, none or whitelist. If you choose All, CloudFront
     * forwards all cookies regardless of how many your application uses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>none, whitelist, all
     *
     * @param forward Use this element to specify whether you want CloudFront to forward
     *         cookies to the origin that is associated with this cache behavior. You
     *         can specify all, none or whitelist. If you choose All, CloudFront
     *         forwards all cookies regardless of how many your application uses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ItemSelection
     */
    public CookiePreference withForward(ItemSelection forward) {
        this.forward = forward.toString();
        return this;
    }

    /**
     * A complex type that specifies the whitelisted cookies, if any, that
     * you want CloudFront to forward to your origin that is associated with
     * this cache behavior.
     *
     * @return A complex type that specifies the whitelisted cookies, if any, that
     *         you want CloudFront to forward to your origin that is associated with
     *         this cache behavior.
     */
    public CookieNames getWhitelistedNames() {
        return whitelistedNames;
    }
    
    /**
     * A complex type that specifies the whitelisted cookies, if any, that
     * you want CloudFront to forward to your origin that is associated with
     * this cache behavior.
     *
     * @param whitelistedNames A complex type that specifies the whitelisted cookies, if any, that
     *         you want CloudFront to forward to your origin that is associated with
     *         this cache behavior.
     */
    public void setWhitelistedNames(CookieNames whitelistedNames) {
        this.whitelistedNames = whitelistedNames;
    }
    
    /**
     * A complex type that specifies the whitelisted cookies, if any, that
     * you want CloudFront to forward to your origin that is associated with
     * this cache behavior.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param whitelistedNames A complex type that specifies the whitelisted cookies, if any, that
     *         you want CloudFront to forward to your origin that is associated with
     *         this cache behavior.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CookiePreference withWhitelistedNames(CookieNames whitelistedNames) {
        this.whitelistedNames = whitelistedNames;
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
        if (getForward() != null) sb.append("Forward: " + getForward() + ",");
        if (getWhitelistedNames() != null) sb.append("WhitelistedNames: " + getWhitelistedNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getForward() == null) ? 0 : getForward().hashCode()); 
        hashCode = prime * hashCode + ((getWhitelistedNames() == null) ? 0 : getWhitelistedNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CookiePreference == false) return false;
        CookiePreference other = (CookiePreference)obj;
        
        if (other.getForward() == null ^ this.getForward() == null) return false;
        if (other.getForward() != null && other.getForward().equals(this.getForward()) == false) return false; 
        if (other.getWhitelistedNames() == null ^ this.getWhitelistedNames() == null) return false;
        if (other.getWhitelistedNames() != null && other.getWhitelistedNames().equals(this.getWhitelistedNames()) == false) return false; 
        return true;
    }
    
}
    