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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A sheet is an object that contains a set of visuals that are viewed together on one page in a paginated report. Every
 * analysis and dashboard must contain at least one sheet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SheetDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SheetDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a sheet.
     * </p>
     */
    private String sheetId;
    /**
     * <p>
     * The title of the sheet.
     * </p>
     */
    private String title;
    /**
     * <p>
     * A description of the sheet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the sheet. This name is displayed on the sheet's tab in the Amazon QuickSight console.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The list of parameter controls that are on a sheet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html">Using a Control with a
     * Parameter in Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private java.util.List<ParameterControl> parameterControls;
    /**
     * <p>
     * The list of filter controls that are on a sheet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html">Adding filter controls to analysis
     * sheets</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private java.util.List<FilterControl> filterControls;
    /**
     * <p>
     * A list of the visuals that are on a sheet. Visual placement is determined by the layout of the sheet.
     * </p>
     */
    private java.util.List<Visual> visuals;
    /**
     * <p>
     * The text boxes that are on a sheet.
     * </p>
     */
    private java.util.List<SheetTextBox> textBoxes;
    /**
     * <p>
     * Layouts define how the components of a sheet are arranged.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html">Types
     * of layout</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private java.util.List<Layout> layouts;
    /**
     * <p>
     * The control layouts of the sheet.
     * </p>
     */
    private java.util.List<SheetControlLayout> sheetControlLayouts;
    /**
     * <p>
     * The layout content type of the sheet. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PAGINATED</code>: Creates a sheet for a paginated report.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERACTIVE</code>: Creates a sheet for an interactive dashboard.
     * </p>
     * </li>
     * </ul>
     */
    private String contentType;

    /**
     * <p>
     * The unique identifier of a sheet.
     * </p>
     * 
     * @param sheetId
     *        The unique identifier of a sheet.
     */

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    /**
     * <p>
     * The unique identifier of a sheet.
     * </p>
     * 
     * @return The unique identifier of a sheet.
     */

    public String getSheetId() {
        return this.sheetId;
    }

    /**
     * <p>
     * The unique identifier of a sheet.
     * </p>
     * 
     * @param sheetId
     *        The unique identifier of a sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withSheetId(String sheetId) {
        setSheetId(sheetId);
        return this;
    }

    /**
     * <p>
     * The title of the sheet.
     * </p>
     * 
     * @param title
     *        The title of the sheet.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the sheet.
     * </p>
     * 
     * @return The title of the sheet.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the sheet.
     * </p>
     * 
     * @param title
     *        The title of the sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * A description of the sheet.
     * </p>
     * 
     * @param description
     *        A description of the sheet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the sheet.
     * </p>
     * 
     * @return A description of the sheet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the sheet.
     * </p>
     * 
     * @param description
     *        A description of the sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the sheet. This name is displayed on the sheet's tab in the Amazon QuickSight console.
     * </p>
     * 
     * @param name
     *        The name of the sheet. This name is displayed on the sheet's tab in the Amazon QuickSight console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the sheet. This name is displayed on the sheet's tab in the Amazon QuickSight console.
     * </p>
     * 
     * @return The name of the sheet. This name is displayed on the sheet's tab in the Amazon QuickSight console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the sheet. This name is displayed on the sheet's tab in the Amazon QuickSight console.
     * </p>
     * 
     * @param name
     *        The name of the sheet. This name is displayed on the sheet's tab in the Amazon QuickSight console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The list of parameter controls that are on a sheet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html">Using a Control with a
     * Parameter in Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return The list of parameter controls that are on a sheet.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html">Using a Control with a
     *         Parameter in Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public java.util.List<ParameterControl> getParameterControls() {
        return parameterControls;
    }

    /**
     * <p>
     * The list of parameter controls that are on a sheet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html">Using a Control with a
     * Parameter in Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param parameterControls
     *        The list of parameter controls that are on a sheet.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html">Using a Control with a
     *        Parameter in Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setParameterControls(java.util.Collection<ParameterControl> parameterControls) {
        if (parameterControls == null) {
            this.parameterControls = null;
            return;
        }

        this.parameterControls = new java.util.ArrayList<ParameterControl>(parameterControls);
    }

    /**
     * <p>
     * The list of parameter controls that are on a sheet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html">Using a Control with a
     * Parameter in Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterControls(java.util.Collection)} or {@link #withParameterControls(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param parameterControls
     *        The list of parameter controls that are on a sheet.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html">Using a Control with a
     *        Parameter in Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withParameterControls(ParameterControl... parameterControls) {
        if (this.parameterControls == null) {
            setParameterControls(new java.util.ArrayList<ParameterControl>(parameterControls.length));
        }
        for (ParameterControl ele : parameterControls) {
            this.parameterControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of parameter controls that are on a sheet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html">Using a Control with a
     * Parameter in Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param parameterControls
     *        The list of parameter controls that are on a sheet.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html">Using a Control with a
     *        Parameter in Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withParameterControls(java.util.Collection<ParameterControl> parameterControls) {
        setParameterControls(parameterControls);
        return this;
    }

    /**
     * <p>
     * The list of filter controls that are on a sheet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html">Adding filter controls to analysis
     * sheets</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return The list of filter controls that are on a sheet.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html">Adding filter controls to
     *         analysis sheets</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public java.util.List<FilterControl> getFilterControls() {
        return filterControls;
    }

    /**
     * <p>
     * The list of filter controls that are on a sheet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html">Adding filter controls to analysis
     * sheets</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param filterControls
     *        The list of filter controls that are on a sheet.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html">Adding filter controls to
     *        analysis sheets</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setFilterControls(java.util.Collection<FilterControl> filterControls) {
        if (filterControls == null) {
            this.filterControls = null;
            return;
        }

        this.filterControls = new java.util.ArrayList<FilterControl>(filterControls);
    }

    /**
     * <p>
     * The list of filter controls that are on a sheet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html">Adding filter controls to analysis
     * sheets</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterControls(java.util.Collection)} or {@link #withFilterControls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param filterControls
     *        The list of filter controls that are on a sheet.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html">Adding filter controls to
     *        analysis sheets</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withFilterControls(FilterControl... filterControls) {
        if (this.filterControls == null) {
            setFilterControls(new java.util.ArrayList<FilterControl>(filterControls.length));
        }
        for (FilterControl ele : filterControls) {
            this.filterControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of filter controls that are on a sheet.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html">Adding filter controls to analysis
     * sheets</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param filterControls
     *        The list of filter controls that are on a sheet.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html">Adding filter controls to
     *        analysis sheets</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withFilterControls(java.util.Collection<FilterControl> filterControls) {
        setFilterControls(filterControls);
        return this;
    }

    /**
     * <p>
     * A list of the visuals that are on a sheet. Visual placement is determined by the layout of the sheet.
     * </p>
     * 
     * @return A list of the visuals that are on a sheet. Visual placement is determined by the layout of the sheet.
     */

    public java.util.List<Visual> getVisuals() {
        return visuals;
    }

    /**
     * <p>
     * A list of the visuals that are on a sheet. Visual placement is determined by the layout of the sheet.
     * </p>
     * 
     * @param visuals
     *        A list of the visuals that are on a sheet. Visual placement is determined by the layout of the sheet.
     */

    public void setVisuals(java.util.Collection<Visual> visuals) {
        if (visuals == null) {
            this.visuals = null;
            return;
        }

        this.visuals = new java.util.ArrayList<Visual>(visuals);
    }

    /**
     * <p>
     * A list of the visuals that are on a sheet. Visual placement is determined by the layout of the sheet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVisuals(java.util.Collection)} or {@link #withVisuals(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param visuals
     *        A list of the visuals that are on a sheet. Visual placement is determined by the layout of the sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withVisuals(Visual... visuals) {
        if (this.visuals == null) {
            setVisuals(new java.util.ArrayList<Visual>(visuals.length));
        }
        for (Visual ele : visuals) {
            this.visuals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the visuals that are on a sheet. Visual placement is determined by the layout of the sheet.
     * </p>
     * 
     * @param visuals
     *        A list of the visuals that are on a sheet. Visual placement is determined by the layout of the sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withVisuals(java.util.Collection<Visual> visuals) {
        setVisuals(visuals);
        return this;
    }

    /**
     * <p>
     * The text boxes that are on a sheet.
     * </p>
     * 
     * @return The text boxes that are on a sheet.
     */

    public java.util.List<SheetTextBox> getTextBoxes() {
        return textBoxes;
    }

    /**
     * <p>
     * The text boxes that are on a sheet.
     * </p>
     * 
     * @param textBoxes
     *        The text boxes that are on a sheet.
     */

    public void setTextBoxes(java.util.Collection<SheetTextBox> textBoxes) {
        if (textBoxes == null) {
            this.textBoxes = null;
            return;
        }

        this.textBoxes = new java.util.ArrayList<SheetTextBox>(textBoxes);
    }

    /**
     * <p>
     * The text boxes that are on a sheet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextBoxes(java.util.Collection)} or {@link #withTextBoxes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param textBoxes
     *        The text boxes that are on a sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withTextBoxes(SheetTextBox... textBoxes) {
        if (this.textBoxes == null) {
            setTextBoxes(new java.util.ArrayList<SheetTextBox>(textBoxes.length));
        }
        for (SheetTextBox ele : textBoxes) {
            this.textBoxes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The text boxes that are on a sheet.
     * </p>
     * 
     * @param textBoxes
     *        The text boxes that are on a sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withTextBoxes(java.util.Collection<SheetTextBox> textBoxes) {
        setTextBoxes(textBoxes);
        return this;
    }

    /**
     * <p>
     * Layouts define how the components of a sheet are arranged.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html">Types
     * of layout</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return Layouts define how the components of a sheet are arranged.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html">Types of layout</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public java.util.List<Layout> getLayouts() {
        return layouts;
    }

    /**
     * <p>
     * Layouts define how the components of a sheet are arranged.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html">Types
     * of layout</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param layouts
     *        Layouts define how the components of a sheet are arranged.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html">Types of layout</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setLayouts(java.util.Collection<Layout> layouts) {
        if (layouts == null) {
            this.layouts = null;
            return;
        }

        this.layouts = new java.util.ArrayList<Layout>(layouts);
    }

    /**
     * <p>
     * Layouts define how the components of a sheet are arranged.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html">Types
     * of layout</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayouts(java.util.Collection)} or {@link #withLayouts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param layouts
     *        Layouts define how the components of a sheet are arranged.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html">Types of layout</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withLayouts(Layout... layouts) {
        if (this.layouts == null) {
            setLayouts(new java.util.ArrayList<Layout>(layouts.length));
        }
        for (Layout ele : layouts) {
            this.layouts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Layouts define how the components of a sheet are arranged.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html">Types
     * of layout</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param layouts
     *        Layouts define how the components of a sheet are arranged.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html">Types of layout</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withLayouts(java.util.Collection<Layout> layouts) {
        setLayouts(layouts);
        return this;
    }

    /**
     * <p>
     * The control layouts of the sheet.
     * </p>
     * 
     * @return The control layouts of the sheet.
     */

    public java.util.List<SheetControlLayout> getSheetControlLayouts() {
        return sheetControlLayouts;
    }

    /**
     * <p>
     * The control layouts of the sheet.
     * </p>
     * 
     * @param sheetControlLayouts
     *        The control layouts of the sheet.
     */

    public void setSheetControlLayouts(java.util.Collection<SheetControlLayout> sheetControlLayouts) {
        if (sheetControlLayouts == null) {
            this.sheetControlLayouts = null;
            return;
        }

        this.sheetControlLayouts = new java.util.ArrayList<SheetControlLayout>(sheetControlLayouts);
    }

    /**
     * <p>
     * The control layouts of the sheet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSheetControlLayouts(java.util.Collection)} or {@link #withSheetControlLayouts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param sheetControlLayouts
     *        The control layouts of the sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withSheetControlLayouts(SheetControlLayout... sheetControlLayouts) {
        if (this.sheetControlLayouts == null) {
            setSheetControlLayouts(new java.util.ArrayList<SheetControlLayout>(sheetControlLayouts.length));
        }
        for (SheetControlLayout ele : sheetControlLayouts) {
            this.sheetControlLayouts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The control layouts of the sheet.
     * </p>
     * 
     * @param sheetControlLayouts
     *        The control layouts of the sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetDefinition withSheetControlLayouts(java.util.Collection<SheetControlLayout> sheetControlLayouts) {
        setSheetControlLayouts(sheetControlLayouts);
        return this;
    }

    /**
     * <p>
     * The layout content type of the sheet. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PAGINATED</code>: Creates a sheet for a paginated report.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERACTIVE</code>: Creates a sheet for an interactive dashboard.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The layout content type of the sheet. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PAGINATED</code>: Creates a sheet for a paginated report.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERACTIVE</code>: Creates a sheet for an interactive dashboard.
     *        </p>
     *        </li>
     * @see SheetContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The layout content type of the sheet. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PAGINATED</code>: Creates a sheet for a paginated report.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERACTIVE</code>: Creates a sheet for an interactive dashboard.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The layout content type of the sheet. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PAGINATED</code>: Creates a sheet for a paginated report.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INTERACTIVE</code>: Creates a sheet for an interactive dashboard.
     *         </p>
     *         </li>
     * @see SheetContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The layout content type of the sheet. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PAGINATED</code>: Creates a sheet for a paginated report.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERACTIVE</code>: Creates a sheet for an interactive dashboard.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The layout content type of the sheet. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PAGINATED</code>: Creates a sheet for a paginated report.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERACTIVE</code>: Creates a sheet for an interactive dashboard.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetContentType
     */

    public SheetDefinition withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The layout content type of the sheet. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PAGINATED</code>: Creates a sheet for a paginated report.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERACTIVE</code>: Creates a sheet for an interactive dashboard.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        The layout content type of the sheet. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PAGINATED</code>: Creates a sheet for a paginated report.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERACTIVE</code>: Creates a sheet for an interactive dashboard.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetContentType
     */

    public SheetDefinition withContentType(SheetContentType contentType) {
        this.contentType = contentType.toString();
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
        if (getSheetId() != null)
            sb.append("SheetId: ").append(getSheetId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getParameterControls() != null)
            sb.append("ParameterControls: ").append(getParameterControls()).append(",");
        if (getFilterControls() != null)
            sb.append("FilterControls: ").append(getFilterControls()).append(",");
        if (getVisuals() != null)
            sb.append("Visuals: ").append(getVisuals()).append(",");
        if (getTextBoxes() != null)
            sb.append("TextBoxes: ").append(getTextBoxes()).append(",");
        if (getLayouts() != null)
            sb.append("Layouts: ").append(getLayouts()).append(",");
        if (getSheetControlLayouts() != null)
            sb.append("SheetControlLayouts: ").append(getSheetControlLayouts()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SheetDefinition == false)
            return false;
        SheetDefinition other = (SheetDefinition) obj;
        if (other.getSheetId() == null ^ this.getSheetId() == null)
            return false;
        if (other.getSheetId() != null && other.getSheetId().equals(this.getSheetId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParameterControls() == null ^ this.getParameterControls() == null)
            return false;
        if (other.getParameterControls() != null && other.getParameterControls().equals(this.getParameterControls()) == false)
            return false;
        if (other.getFilterControls() == null ^ this.getFilterControls() == null)
            return false;
        if (other.getFilterControls() != null && other.getFilterControls().equals(this.getFilterControls()) == false)
            return false;
        if (other.getVisuals() == null ^ this.getVisuals() == null)
            return false;
        if (other.getVisuals() != null && other.getVisuals().equals(this.getVisuals()) == false)
            return false;
        if (other.getTextBoxes() == null ^ this.getTextBoxes() == null)
            return false;
        if (other.getTextBoxes() != null && other.getTextBoxes().equals(this.getTextBoxes()) == false)
            return false;
        if (other.getLayouts() == null ^ this.getLayouts() == null)
            return false;
        if (other.getLayouts() != null && other.getLayouts().equals(this.getLayouts()) == false)
            return false;
        if (other.getSheetControlLayouts() == null ^ this.getSheetControlLayouts() == null)
            return false;
        if (other.getSheetControlLayouts() != null && other.getSheetControlLayouts().equals(this.getSheetControlLayouts()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSheetId() == null) ? 0 : getSheetId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParameterControls() == null) ? 0 : getParameterControls().hashCode());
        hashCode = prime * hashCode + ((getFilterControls() == null) ? 0 : getFilterControls().hashCode());
        hashCode = prime * hashCode + ((getVisuals() == null) ? 0 : getVisuals().hashCode());
        hashCode = prime * hashCode + ((getTextBoxes() == null) ? 0 : getTextBoxes().hashCode());
        hashCode = prime * hashCode + ((getLayouts() == null) ? 0 : getLayouts().hashCode());
        hashCode = prime * hashCode + ((getSheetControlLayouts() == null) ? 0 : getSheetControlLayouts().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public SheetDefinition clone() {
        try {
            return (SheetDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SheetDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
