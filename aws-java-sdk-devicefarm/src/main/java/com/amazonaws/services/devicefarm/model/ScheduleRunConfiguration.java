/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the settings for a run. Includes things like location, radio states, auxiliary apps, and network profiles.
 * </p>
 */
public class ScheduleRunConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm will extract to
     * external data for Android or the app's sandbox for iOS.
     * </p>
     */
    private String extraDataPackageArn;
    /**
     * <p>
     * Reserved for internal use.
     * </p>
     */
    private String networkProfileArn;
    /**
     * <p>
     * Information about the locale that is used for the run.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * Information about the location that is used for the run.
     * </p>
     */
    private Location location;
    /**
     * <p>
     * Information about the radio states for the run.
     * </p>
     */
    private Radios radios;
    /**
     * <p>
     * A list of auxiliary apps for the run.
     * </p>
     */
    private java.util.List<String> auxiliaryApps;
    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     */
    private String billingMethod;

    /**
     * <p>
     * The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm will extract to
     * external data for Android or the app's sandbox for iOS.
     * </p>
     * 
     * @param extraDataPackageArn
     *        The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm will extract to
     *        external data for Android or the app's sandbox for iOS.
     */

    public void setExtraDataPackageArn(String extraDataPackageArn) {
        this.extraDataPackageArn = extraDataPackageArn;
    }

    /**
     * <p>
     * The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm will extract to
     * external data for Android or the app's sandbox for iOS.
     * </p>
     * 
     * @return The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm will extract to
     *         external data for Android or the app's sandbox for iOS.
     */

    public String getExtraDataPackageArn() {
        return this.extraDataPackageArn;
    }

    /**
     * <p>
     * The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm will extract to
     * external data for Android or the app's sandbox for iOS.
     * </p>
     * 
     * @param extraDataPackageArn
     *        The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm will extract to
     *        external data for Android or the app's sandbox for iOS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunConfiguration withExtraDataPackageArn(String extraDataPackageArn) {
        setExtraDataPackageArn(extraDataPackageArn);
        return this;
    }

    /**
     * <p>
     * Reserved for internal use.
     * </p>
     * 
     * @param networkProfileArn
     *        Reserved for internal use.
     */

    public void setNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
    }

    /**
     * <p>
     * Reserved for internal use.
     * </p>
     * 
     * @return Reserved for internal use.
     */

    public String getNetworkProfileArn() {
        return this.networkProfileArn;
    }

    /**
     * <p>
     * Reserved for internal use.
     * </p>
     * 
     * @param networkProfileArn
     *        Reserved for internal use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunConfiguration withNetworkProfileArn(String networkProfileArn) {
        setNetworkProfileArn(networkProfileArn);
        return this;
    }

    /**
     * <p>
     * Information about the locale that is used for the run.
     * </p>
     * 
     * @param locale
     *        Information about the locale that is used for the run.
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * Information about the locale that is used for the run.
     * </p>
     * 
     * @return Information about the locale that is used for the run.
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * Information about the locale that is used for the run.
     * </p>
     * 
     * @param locale
     *        Information about the locale that is used for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunConfiguration withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * Information about the location that is used for the run.
     * </p>
     * 
     * @param location
     *        Information about the location that is used for the run.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location that is used for the run.
     * </p>
     * 
     * @return Information about the location that is used for the run.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the location that is used for the run.
     * </p>
     * 
     * @param location
     *        Information about the location that is used for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunConfiguration withLocation(Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Information about the radio states for the run.
     * </p>
     * 
     * @param radios
     *        Information about the radio states for the run.
     */

    public void setRadios(Radios radios) {
        this.radios = radios;
    }

    /**
     * <p>
     * Information about the radio states for the run.
     * </p>
     * 
     * @return Information about the radio states for the run.
     */

    public Radios getRadios() {
        return this.radios;
    }

    /**
     * <p>
     * Information about the radio states for the run.
     * </p>
     * 
     * @param radios
     *        Information about the radio states for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunConfiguration withRadios(Radios radios) {
        setRadios(radios);
        return this;
    }

    /**
     * <p>
     * A list of auxiliary apps for the run.
     * </p>
     * 
     * @return A list of auxiliary apps for the run.
     */

    public java.util.List<String> getAuxiliaryApps() {
        return auxiliaryApps;
    }

    /**
     * <p>
     * A list of auxiliary apps for the run.
     * </p>
     * 
     * @param auxiliaryApps
     *        A list of auxiliary apps for the run.
     */

    public void setAuxiliaryApps(java.util.Collection<String> auxiliaryApps) {
        if (auxiliaryApps == null) {
            this.auxiliaryApps = null;
            return;
        }

        this.auxiliaryApps = new java.util.ArrayList<String>(auxiliaryApps);
    }

    /**
     * <p>
     * A list of auxiliary apps for the run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuxiliaryApps(java.util.Collection)} or {@link #withAuxiliaryApps(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param auxiliaryApps
     *        A list of auxiliary apps for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunConfiguration withAuxiliaryApps(String... auxiliaryApps) {
        if (this.auxiliaryApps == null) {
            setAuxiliaryApps(new java.util.ArrayList<String>(auxiliaryApps.length));
        }
        for (String ele : auxiliaryApps) {
            this.auxiliaryApps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of auxiliary apps for the run.
     * </p>
     * 
     * @param auxiliaryApps
     *        A list of auxiliary apps for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleRunConfiguration withAuxiliaryApps(java.util.Collection<String> auxiliaryApps) {
        setAuxiliaryApps(auxiliaryApps);
        return this;
    }

    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     * 
     * @param billingMethod
     *        Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the
     *        parameter is not specified, the default value is <code>metered</code>.
     * @see BillingMethod
     */

    public void setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
    }

    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     * 
     * @return Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the
     *         parameter is not specified, the default value is <code>metered</code>.
     * @see BillingMethod
     */

    public String getBillingMethod() {
        return this.billingMethod;
    }

    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     * 
     * @param billingMethod
     *        Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the
     *        parameter is not specified, the default value is <code>metered</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMethod
     */

    public ScheduleRunConfiguration withBillingMethod(String billingMethod) {
        setBillingMethod(billingMethod);
        return this;
    }

    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     * 
     * @param billingMethod
     *        Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the
     *        parameter is not specified, the default value is <code>metered</code>.
     * @see BillingMethod
     */

    public void setBillingMethod(BillingMethod billingMethod) {
        this.billingMethod = billingMethod.toString();
    }

    /**
     * <p>
     * Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the parameter is
     * not specified, the default value is <code>metered</code>.
     * </p>
     * 
     * @param billingMethod
     *        Specifies the billing method for a test run: <code>metered</code> or <code>unmetered</code>. If the
     *        parameter is not specified, the default value is <code>metered</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMethod
     */

    public ScheduleRunConfiguration withBillingMethod(BillingMethod billingMethod) {
        setBillingMethod(billingMethod);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getExtraDataPackageArn() != null)
            sb.append("ExtraDataPackageArn: " + getExtraDataPackageArn() + ",");
        if (getNetworkProfileArn() != null)
            sb.append("NetworkProfileArn: " + getNetworkProfileArn() + ",");
        if (getLocale() != null)
            sb.append("Locale: " + getLocale() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getRadios() != null)
            sb.append("Radios: " + getRadios() + ",");
        if (getAuxiliaryApps() != null)
            sb.append("AuxiliaryApps: " + getAuxiliaryApps() + ",");
        if (getBillingMethod() != null)
            sb.append("BillingMethod: " + getBillingMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleRunConfiguration == false)
            return false;
        ScheduleRunConfiguration other = (ScheduleRunConfiguration) obj;
        if (other.getExtraDataPackageArn() == null ^ this.getExtraDataPackageArn() == null)
            return false;
        if (other.getExtraDataPackageArn() != null && other.getExtraDataPackageArn().equals(this.getExtraDataPackageArn()) == false)
            return false;
        if (other.getNetworkProfileArn() == null ^ this.getNetworkProfileArn() == null)
            return false;
        if (other.getNetworkProfileArn() != null && other.getNetworkProfileArn().equals(this.getNetworkProfileArn()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getRadios() == null ^ this.getRadios() == null)
            return false;
        if (other.getRadios() != null && other.getRadios().equals(this.getRadios()) == false)
            return false;
        if (other.getAuxiliaryApps() == null ^ this.getAuxiliaryApps() == null)
            return false;
        if (other.getAuxiliaryApps() != null && other.getAuxiliaryApps().equals(this.getAuxiliaryApps()) == false)
            return false;
        if (other.getBillingMethod() == null ^ this.getBillingMethod() == null)
            return false;
        if (other.getBillingMethod() != null && other.getBillingMethod().equals(this.getBillingMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtraDataPackageArn() == null) ? 0 : getExtraDataPackageArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkProfileArn() == null) ? 0 : getNetworkProfileArn().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getRadios() == null) ? 0 : getRadios().hashCode());
        hashCode = prime * hashCode + ((getAuxiliaryApps() == null) ? 0 : getAuxiliaryApps().hashCode());
        hashCode = prime * hashCode + ((getBillingMethod() == null) ? 0 : getBillingMethod().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleRunConfiguration clone() {
        try {
            return (ScheduleRunConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
