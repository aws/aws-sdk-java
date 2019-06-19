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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>Block</code> represents items that are recognized in a document within a group of pixels close to each other.
 * The information returned in a <code>Block</code> depends on the type of operation. In document-text detection (for
 * example <a>DetectDocumentText</a>), you get information about the detected words and lines of text. In text analysis
 * (for example <a>AnalyzeDocument</a>), you can also get information about the fields, tables and selection elements
 * that are detected in the document.
 * </p>
 * <p>
 * An array of <code>Block</code> objects is returned by both synchronous and asynchronous operations. In synchronous
 * operations, such as <a>DetectDocumentText</a>, the array of <code>Block</code> objects is the entire set of results.
 * In asynchronous operations, such as <a>GetDocumentAnalysis</a>, the array is returned over one or more responses.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/how-it-works.html">How Amazon
 * Textract Works</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/Block" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Block implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of text that's recognized in a block. In text-detection operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE Block objects that are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child Block objects that are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE Block objects for a field that's detected on a document page. Use
     * the <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block
     * object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces that's detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is any grid-based information with 2 or more
     * rows or columns with a cell span of 1 row and 1 column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of the block that contains the text in the
     * cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selectable element such as a radio button or checkbox that's detected on a document
     * page. Use the value of <code>SelectionStatus</code> to determine the status of the selection element.
     * </p>
     * </li>
     * </ul>
     */
    private String blockType;
    /**
     * <p>
     * The confidence that Amazon Textract has in the accuracy of the recognized text and the accuracy of the geometry
     * points around the recognized text.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * The word or line of text that's recognized by Amazon Textract.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The row in which a table cell is located. The first row position is 1. <code>RowIndex</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     */
    private Integer rowIndex;
    /**
     * <p>
     * The column in which a table cell appears. The first column position is 1. <code>ColumnIndex</code> isn't returned
     * by <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     */
    private Integer columnIndex;
    /**
     * <p>
     * The number of rows that a table spans. <code>RowSpan</code> isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     */
    private Integer rowSpan;
    /**
     * <p>
     * The number of columns that a table cell spans. <code>ColumnSpan</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     */
    private Integer columnSpan;
    /**
     * <p>
     * The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that surrounds
     * the text, and a finer-grain polygon for more accurate spatial information.
     * </p>
     */
    private Geometry geometry;
    /**
     * <p>
     * The identifier for the recognized text. The identifier is only unique for a single operation.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A list of child blocks of the current block. For example a LINE object has child blocks for each WORD block
     * that's part of the line of text. There aren't Relationship objects in the list for relationships that don't
     * exist, such as when the current block has no child blocks. The list size can be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - The block has no child blocks.
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 - The block has child blocks.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Relationship> relationships;
    /**
     * <p>
     * The type of entity. The following can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     */
    private java.util.List<String> entityTypes;
    /**
     * <p>
     * The selection status of a selectable element such as a radio button or checkbox.
     * </p>
     */
    private String selectionStatus;
    /**
     * <p>
     * The page in which a block was detected. <code>Page</code> is returned by asynchronous operations. Page values
     * greater than 1 are only returned for multi-page documents that are in PDF format. A scanned image (JPG/PNG), even
     * if it contains multiple document pages, is always considered to be a single-page document and the value of
     * <code>Page</code> is always 1. Synchronous operations don't return <code>Page</code> as every input document is
     * considered to be a single-page document.
     * </p>
     */
    private Integer page;

    /**
     * <p>
     * The type of text that's recognized in a block. In text-detection operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE Block objects that are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child Block objects that are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE Block objects for a field that's detected on a document page. Use
     * the <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block
     * object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces that's detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is any grid-based information with 2 or more
     * rows or columns with a cell span of 1 row and 1 column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of the block that contains the text in the
     * cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selectable element such as a radio button or checkbox that's detected on a document
     * page. Use the value of <code>SelectionStatus</code> to determine the status of the selection element.
     * </p>
     * </li>
     * </ul>
     * 
     * @param blockType
     *        The type of text that's recognized in a block. In text-detection operations, the following types are
     *        returned:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>PAGE</i> - Contains a list of the LINE Block objects that are detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters
     *        that aren't separated by spaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In text analysis operations, the following types are returned:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>PAGE</i> - Contains a list of child Block objects that are detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE Block objects for a field that's detected on a document
     *        page. Use the <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a KEY Block object
     *        or a VALUE Block object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters
     *        that aren't separated by spaces that's detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TABLE</i> - A table that's detected on a document page. A table is any grid-based information with 2 or
     *        more rows or columns with a cell span of 1 row and 1 column each.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CELL</i> - A cell within a detected table. The cell is the parent of the block that contains the text
     *        in the cell.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>SELECTION_ELEMENT</i> - A selectable element such as a radio button or checkbox that's detected on a
     *        document page. Use the value of <code>SelectionStatus</code> to determine the status of the selection
     *        element.
     *        </p>
     *        </li>
     * @see BlockType
     */

    public void setBlockType(String blockType) {
        this.blockType = blockType;
    }

    /**
     * <p>
     * The type of text that's recognized in a block. In text-detection operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE Block objects that are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child Block objects that are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE Block objects for a field that's detected on a document page. Use
     * the <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block
     * object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces that's detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is any grid-based information with 2 or more
     * rows or columns with a cell span of 1 row and 1 column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of the block that contains the text in the
     * cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selectable element such as a radio button or checkbox that's detected on a document
     * page. Use the value of <code>SelectionStatus</code> to determine the status of the selection element.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of text that's recognized in a block. In text-detection operations, the following types are
     *         returned:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>PAGE</i> - Contains a list of the LINE Block objects that are detected on a document page.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters
     *         that aren't separated by spaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In text analysis operations, the following types are returned:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>PAGE</i> - Contains a list of child Block objects that are detected on a document page.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE Block objects for a field that's detected on a document
     *         page. Use the <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a KEY Block object
     *         or a VALUE Block object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters
     *         that aren't separated by spaces that's detected on a document page.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>TABLE</i> - A table that's detected on a document page. A table is any grid-based information with 2
     *         or more rows or columns with a cell span of 1 row and 1 column each.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>CELL</i> - A cell within a detected table. The cell is the parent of the block that contains the text
     *         in the cell.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>SELECTION_ELEMENT</i> - A selectable element such as a radio button or checkbox that's detected on a
     *         document page. Use the value of <code>SelectionStatus</code> to determine the status of the selection
     *         element.
     *         </p>
     *         </li>
     * @see BlockType
     */

    public String getBlockType() {
        return this.blockType;
    }

    /**
     * <p>
     * The type of text that's recognized in a block. In text-detection operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE Block objects that are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child Block objects that are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE Block objects for a field that's detected on a document page. Use
     * the <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block
     * object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces that's detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is any grid-based information with 2 or more
     * rows or columns with a cell span of 1 row and 1 column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of the block that contains the text in the
     * cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selectable element such as a radio button or checkbox that's detected on a document
     * page. Use the value of <code>SelectionStatus</code> to determine the status of the selection element.
     * </p>
     * </li>
     * </ul>
     * 
     * @param blockType
     *        The type of text that's recognized in a block. In text-detection operations, the following types are
     *        returned:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>PAGE</i> - Contains a list of the LINE Block objects that are detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters
     *        that aren't separated by spaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In text analysis operations, the following types are returned:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>PAGE</i> - Contains a list of child Block objects that are detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE Block objects for a field that's detected on a document
     *        page. Use the <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a KEY Block object
     *        or a VALUE Block object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters
     *        that aren't separated by spaces that's detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TABLE</i> - A table that's detected on a document page. A table is any grid-based information with 2 or
     *        more rows or columns with a cell span of 1 row and 1 column each.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CELL</i> - A cell within a detected table. The cell is the parent of the block that contains the text
     *        in the cell.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>SELECTION_ELEMENT</i> - A selectable element such as a radio button or checkbox that's detected on a
     *        document page. Use the value of <code>SelectionStatus</code> to determine the status of the selection
     *        element.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockType
     */

    public Block withBlockType(String blockType) {
        setBlockType(blockType);
        return this;
    }

    /**
     * <p>
     * The type of text that's recognized in a block. In text-detection operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of the LINE Block objects that are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In text analysis operations, the following types are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>PAGE</i> - Contains a list of child Block objects that are detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE Block objects for a field that's detected on a document page. Use
     * the <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block
     * object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters that
     * aren't separated by spaces that's detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>TABLE</i> - A table that's detected on a document page. A table is any grid-based information with 2 or more
     * rows or columns with a cell span of 1 row and 1 column each.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CELL</i> - A cell within a detected table. The cell is the parent of the block that contains the text in the
     * cell.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>SELECTION_ELEMENT</i> - A selectable element such as a radio button or checkbox that's detected on a document
     * page. Use the value of <code>SelectionStatus</code> to determine the status of the selection element.
     * </p>
     * </li>
     * </ul>
     * 
     * @param blockType
     *        The type of text that's recognized in a block. In text-detection operations, the following types are
     *        returned:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>PAGE</i> - Contains a list of the LINE Block objects that are detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters
     *        that aren't separated by spaces.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In text analysis operations, the following types are returned:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>PAGE</i> - Contains a list of child Block objects that are detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>KEY_VALUE_SET</i> - Stores the KEY and VALUE Block objects for a field that's detected on a document
     *        page. Use the <code>EntityType</code> field to determine if a KEY_VALUE_SET object is a KEY Block object
     *        or a VALUE Block object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>WORD</i> - A word detected on a document page. A word is one or more ISO basic Latin script characters
     *        that aren't separated by spaces that's detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>LINE</i> - A string of tab-delimited, contiguous words that's detected on a document page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>TABLE</i> - A table that's detected on a document page. A table is any grid-based information with 2 or
     *        more rows or columns with a cell span of 1 row and 1 column each.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CELL</i> - A cell within a detected table. The cell is the parent of the block that contains the text
     *        in the cell.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>SELECTION_ELEMENT</i> - A selectable element such as a radio button or checkbox that's detected on a
     *        document page. Use the value of <code>SelectionStatus</code> to determine the status of the selection
     *        element.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockType
     */

    public Block withBlockType(BlockType blockType) {
        this.blockType = blockType.toString();
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Textract has in the accuracy of the recognized text and the accuracy of the geometry
     * points around the recognized text.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Textract has in the accuracy of the recognized text and the accuracy of the
     *        geometry points around the recognized text.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Textract has in the accuracy of the recognized text and the accuracy of the geometry
     * points around the recognized text.
     * </p>
     * 
     * @return The confidence that Amazon Textract has in the accuracy of the recognized text and the accuracy of the
     *         geometry points around the recognized text.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Textract has in the accuracy of the recognized text and the accuracy of the geometry
     * points around the recognized text.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Textract has in the accuracy of the recognized text and the accuracy of the
     *        geometry points around the recognized text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The word or line of text that's recognized by Amazon Textract.
     * </p>
     * 
     * @param text
     *        The word or line of text that's recognized by Amazon Textract.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The word or line of text that's recognized by Amazon Textract.
     * </p>
     * 
     * @return The word or line of text that's recognized by Amazon Textract.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The word or line of text that's recognized by Amazon Textract.
     * </p>
     * 
     * @param text
     *        The word or line of text that's recognized by Amazon Textract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The row in which a table cell is located. The first row position is 1. <code>RowIndex</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param rowIndex
     *        The row in which a table cell is located. The first row position is 1. <code>RowIndex</code> isn't
     *        returned by <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     */

    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    /**
     * <p>
     * The row in which a table cell is located. The first row position is 1. <code>RowIndex</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @return The row in which a table cell is located. The first row position is 1. <code>RowIndex</code> isn't
     *         returned by <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     */

    public Integer getRowIndex() {
        return this.rowIndex;
    }

    /**
     * <p>
     * The row in which a table cell is located. The first row position is 1. <code>RowIndex</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param rowIndex
     *        The row in which a table cell is located. The first row position is 1. <code>RowIndex</code> isn't
     *        returned by <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withRowIndex(Integer rowIndex) {
        setRowIndex(rowIndex);
        return this;
    }

    /**
     * <p>
     * The column in which a table cell appears. The first column position is 1. <code>ColumnIndex</code> isn't returned
     * by <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param columnIndex
     *        The column in which a table cell appears. The first column position is 1. <code>ColumnIndex</code> isn't
     *        returned by <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     */

    public void setColumnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
    }

    /**
     * <p>
     * The column in which a table cell appears. The first column position is 1. <code>ColumnIndex</code> isn't returned
     * by <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @return The column in which a table cell appears. The first column position is 1. <code>ColumnIndex</code> isn't
     *         returned by <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     */

    public Integer getColumnIndex() {
        return this.columnIndex;
    }

    /**
     * <p>
     * The column in which a table cell appears. The first column position is 1. <code>ColumnIndex</code> isn't returned
     * by <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param columnIndex
     *        The column in which a table cell appears. The first column position is 1. <code>ColumnIndex</code> isn't
     *        returned by <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withColumnIndex(Integer columnIndex) {
        setColumnIndex(columnIndex);
        return this;
    }

    /**
     * <p>
     * The number of rows that a table spans. <code>RowSpan</code> isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param rowSpan
     *        The number of rows that a table spans. <code>RowSpan</code> isn't returned by
     *        <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     */

    public void setRowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
    }

    /**
     * <p>
     * The number of rows that a table spans. <code>RowSpan</code> isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @return The number of rows that a table spans. <code>RowSpan</code> isn't returned by
     *         <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     */

    public Integer getRowSpan() {
        return this.rowSpan;
    }

    /**
     * <p>
     * The number of rows that a table spans. <code>RowSpan</code> isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param rowSpan
     *        The number of rows that a table spans. <code>RowSpan</code> isn't returned by
     *        <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withRowSpan(Integer rowSpan) {
        setRowSpan(rowSpan);
        return this;
    }

    /**
     * <p>
     * The number of columns that a table cell spans. <code>ColumnSpan</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param columnSpan
     *        The number of columns that a table cell spans. <code>ColumnSpan</code> isn't returned by
     *        <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     */

    public void setColumnSpan(Integer columnSpan) {
        this.columnSpan = columnSpan;
    }

    /**
     * <p>
     * The number of columns that a table cell spans. <code>ColumnSpan</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @return The number of columns that a table cell spans. <code>ColumnSpan</code> isn't returned by
     *         <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     */

    public Integer getColumnSpan() {
        return this.columnSpan;
    }

    /**
     * <p>
     * The number of columns that a table cell spans. <code>ColumnSpan</code> isn't returned by
     * <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param columnSpan
     *        The number of columns that a table cell spans. <code>ColumnSpan</code> isn't returned by
     *        <code>DetectDocumentText</code> and <code>GetDocumentTextDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withColumnSpan(Integer columnSpan) {
        setColumnSpan(columnSpan);
        return this;
    }

    /**
     * <p>
     * The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that surrounds
     * the text, and a finer-grain polygon for more accurate spatial information.
     * </p>
     * 
     * @param geometry
     *        The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that
     *        surrounds the text, and a finer-grain polygon for more accurate spatial information.
     */

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that surrounds
     * the text, and a finer-grain polygon for more accurate spatial information.
     * </p>
     * 
     * @return The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that
     *         surrounds the text, and a finer-grain polygon for more accurate spatial information.
     */

    public Geometry getGeometry() {
        return this.geometry;
    }

    /**
     * <p>
     * The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that surrounds
     * the text, and a finer-grain polygon for more accurate spatial information.
     * </p>
     * 
     * @param geometry
     *        The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that
     *        surrounds the text, and a finer-grain polygon for more accurate spatial information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withGeometry(Geometry geometry) {
        setGeometry(geometry);
        return this;
    }

    /**
     * <p>
     * The identifier for the recognized text. The identifier is only unique for a single operation.
     * </p>
     * 
     * @param id
     *        The identifier for the recognized text. The identifier is only unique for a single operation.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the recognized text. The identifier is only unique for a single operation.
     * </p>
     * 
     * @return The identifier for the recognized text. The identifier is only unique for a single operation.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the recognized text. The identifier is only unique for a single operation.
     * </p>
     * 
     * @param id
     *        The identifier for the recognized text. The identifier is only unique for a single operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example a LINE object has child blocks for each WORD block
     * that's part of the line of text. There aren't Relationship objects in the list for relationships that don't
     * exist, such as when the current block has no child blocks. The list size can be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - The block has no child blocks.
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 - The block has child blocks.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of child blocks of the current block. For example a LINE object has child blocks for each WORD
     *         block that's part of the line of text. There aren't Relationship objects in the list for relationships
     *         that don't exist, such as when the current block has no child blocks. The list size can be the
     *         following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         0 - The block has no child blocks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1 - The block has child blocks.
     *         </p>
     *         </li>
     */

    public java.util.List<Relationship> getRelationships() {
        return relationships;
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example a LINE object has child blocks for each WORD block
     * that's part of the line of text. There aren't Relationship objects in the list for relationships that don't
     * exist, such as when the current block has no child blocks. The list size can be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - The block has no child blocks.
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 - The block has child blocks.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationships
     *        A list of child blocks of the current block. For example a LINE object has child blocks for each WORD
     *        block that's part of the line of text. There aren't Relationship objects in the list for relationships
     *        that don't exist, such as when the current block has no child blocks. The list size can be the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        0 - The block has no child blocks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1 - The block has child blocks.
     *        </p>
     *        </li>
     */

    public void setRelationships(java.util.Collection<Relationship> relationships) {
        if (relationships == null) {
            this.relationships = null;
            return;
        }

        this.relationships = new java.util.ArrayList<Relationship>(relationships);
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example a LINE object has child blocks for each WORD block
     * that's part of the line of text. There aren't Relationship objects in the list for relationships that don't
     * exist, such as when the current block has no child blocks. The list size can be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - The block has no child blocks.
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 - The block has child blocks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelationships(java.util.Collection)} or {@link #withRelationships(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param relationships
     *        A list of child blocks of the current block. For example a LINE object has child blocks for each WORD
     *        block that's part of the line of text. There aren't Relationship objects in the list for relationships
     *        that don't exist, such as when the current block has no child blocks. The list size can be the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        0 - The block has no child blocks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1 - The block has child blocks.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withRelationships(Relationship... relationships) {
        if (this.relationships == null) {
            setRelationships(new java.util.ArrayList<Relationship>(relationships.length));
        }
        for (Relationship ele : relationships) {
            this.relationships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of child blocks of the current block. For example a LINE object has child blocks for each WORD block
     * that's part of the line of text. There aren't Relationship objects in the list for relationships that don't
     * exist, such as when the current block has no child blocks. The list size can be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 0 - The block has no child blocks.
     * </p>
     * </li>
     * <li>
     * <p>
     * 1 - The block has child blocks.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationships
     *        A list of child blocks of the current block. For example a LINE object has child blocks for each WORD
     *        block that's part of the line of text. There aren't Relationship objects in the list for relationships
     *        that don't exist, such as when the current block has no child blocks. The list size can be the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        0 - The block has no child blocks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        1 - The block has child blocks.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withRelationships(java.util.Collection<Relationship> relationships) {
        setRelationships(relationships);
        return this;
    }

    /**
     * <p>
     * The type of entity. The following can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @return The type of entity. The following can be returned:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>KEY</i> - An identifier for a field on the document.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>VALUE</i> - The field text.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     *         <code>GetDocumentTextDetection</code>.
     * @see EntityType
     */

    public java.util.List<String> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * The type of entity. The following can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param entityTypes
     *        The type of entity. The following can be returned:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>KEY</i> - An identifier for a field on the document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>VALUE</i> - The field text.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     *        <code>GetDocumentTextDetection</code>.
     * @see EntityType
     */

    public void setEntityTypes(java.util.Collection<String> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<String>(entityTypes);
    }

    /**
     * <p>
     * The type of entity. The following can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypes(java.util.Collection)} or {@link #withEntityTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityTypes
     *        The type of entity. The following can be returned:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>KEY</i> - An identifier for a field on the document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>VALUE</i> - The field text.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     *        <code>GetDocumentTextDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public Block withEntityTypes(String... entityTypes) {
        if (this.entityTypes == null) {
            setEntityTypes(new java.util.ArrayList<String>(entityTypes.length));
        }
        for (String ele : entityTypes) {
            this.entityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of entity. The following can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param entityTypes
     *        The type of entity. The following can be returned:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>KEY</i> - An identifier for a field on the document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>VALUE</i> - The field text.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     *        <code>GetDocumentTextDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public Block withEntityTypes(java.util.Collection<String> entityTypes) {
        setEntityTypes(entityTypes);
        return this;
    }

    /**
     * <p>
     * The type of entity. The following can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEY</i> - An identifier for a field on the document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>VALUE</i> - The field text.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     * <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param entityTypes
     *        The type of entity. The following can be returned:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>KEY</i> - An identifier for a field on the document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>VALUE</i> - The field text.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>EntityTypes</code> isn't returned by <code>DetectDocumentText</code> and
     *        <code>GetDocumentTextDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public Block withEntityTypes(EntityType... entityTypes) {
        java.util.ArrayList<String> entityTypesCopy = new java.util.ArrayList<String>(entityTypes.length);
        for (EntityType value : entityTypes) {
            entityTypesCopy.add(value.toString());
        }
        if (getEntityTypes() == null) {
            setEntityTypes(entityTypesCopy);
        } else {
            getEntityTypes().addAll(entityTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The selection status of a selectable element such as a radio button or checkbox.
     * </p>
     * 
     * @param selectionStatus
     *        The selection status of a selectable element such as a radio button or checkbox.
     * @see SelectionStatus
     */

    public void setSelectionStatus(String selectionStatus) {
        this.selectionStatus = selectionStatus;
    }

    /**
     * <p>
     * The selection status of a selectable element such as a radio button or checkbox.
     * </p>
     * 
     * @return The selection status of a selectable element such as a radio button or checkbox.
     * @see SelectionStatus
     */

    public String getSelectionStatus() {
        return this.selectionStatus;
    }

    /**
     * <p>
     * The selection status of a selectable element such as a radio button or checkbox.
     * </p>
     * 
     * @param selectionStatus
     *        The selection status of a selectable element such as a radio button or checkbox.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectionStatus
     */

    public Block withSelectionStatus(String selectionStatus) {
        setSelectionStatus(selectionStatus);
        return this;
    }

    /**
     * <p>
     * The selection status of a selectable element such as a radio button or checkbox.
     * </p>
     * 
     * @param selectionStatus
     *        The selection status of a selectable element such as a radio button or checkbox.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectionStatus
     */

    public Block withSelectionStatus(SelectionStatus selectionStatus) {
        this.selectionStatus = selectionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The page in which a block was detected. <code>Page</code> is returned by asynchronous operations. Page values
     * greater than 1 are only returned for multi-page documents that are in PDF format. A scanned image (JPG/PNG), even
     * if it contains multiple document pages, is always considered to be a single-page document and the value of
     * <code>Page</code> is always 1. Synchronous operations don't return <code>Page</code> as every input document is
     * considered to be a single-page document.
     * </p>
     * 
     * @param page
     *        The page in which a block was detected. <code>Page</code> is returned by asynchronous operations. Page
     *        values greater than 1 are only returned for multi-page documents that are in PDF format. A scanned image
     *        (JPG/PNG), even if it contains multiple document pages, is always considered to be a single-page document
     *        and the value of <code>Page</code> is always 1. Synchronous operations don't return <code>Page</code> as
     *        every input document is considered to be a single-page document.
     */

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * The page in which a block was detected. <code>Page</code> is returned by asynchronous operations. Page values
     * greater than 1 are only returned for multi-page documents that are in PDF format. A scanned image (JPG/PNG), even
     * if it contains multiple document pages, is always considered to be a single-page document and the value of
     * <code>Page</code> is always 1. Synchronous operations don't return <code>Page</code> as every input document is
     * considered to be a single-page document.
     * </p>
     * 
     * @return The page in which a block was detected. <code>Page</code> is returned by asynchronous operations. Page
     *         values greater than 1 are only returned for multi-page documents that are in PDF format. A scanned image
     *         (JPG/PNG), even if it contains multiple document pages, is always considered to be a single-page document
     *         and the value of <code>Page</code> is always 1. Synchronous operations don't return <code>Page</code> as
     *         every input document is considered to be a single-page document.
     */

    public Integer getPage() {
        return this.page;
    }

    /**
     * <p>
     * The page in which a block was detected. <code>Page</code> is returned by asynchronous operations. Page values
     * greater than 1 are only returned for multi-page documents that are in PDF format. A scanned image (JPG/PNG), even
     * if it contains multiple document pages, is always considered to be a single-page document and the value of
     * <code>Page</code> is always 1. Synchronous operations don't return <code>Page</code> as every input document is
     * considered to be a single-page document.
     * </p>
     * 
     * @param page
     *        The page in which a block was detected. <code>Page</code> is returned by asynchronous operations. Page
     *        values greater than 1 are only returned for multi-page documents that are in PDF format. A scanned image
     *        (JPG/PNG), even if it contains multiple document pages, is always considered to be a single-page document
     *        and the value of <code>Page</code> is always 1. Synchronous operations don't return <code>Page</code> as
     *        every input document is considered to be a single-page document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Block withPage(Integer page) {
        setPage(page);
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
        if (getBlockType() != null)
            sb.append("BlockType: ").append(getBlockType()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getRowIndex() != null)
            sb.append("RowIndex: ").append(getRowIndex()).append(",");
        if (getColumnIndex() != null)
            sb.append("ColumnIndex: ").append(getColumnIndex()).append(",");
        if (getRowSpan() != null)
            sb.append("RowSpan: ").append(getRowSpan()).append(",");
        if (getColumnSpan() != null)
            sb.append("ColumnSpan: ").append(getColumnSpan()).append(",");
        if (getGeometry() != null)
            sb.append("Geometry: ").append(getGeometry()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRelationships() != null)
            sb.append("Relationships: ").append(getRelationships()).append(",");
        if (getEntityTypes() != null)
            sb.append("EntityTypes: ").append(getEntityTypes()).append(",");
        if (getSelectionStatus() != null)
            sb.append("SelectionStatus: ").append(getSelectionStatus()).append(",");
        if (getPage() != null)
            sb.append("Page: ").append(getPage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Block == false)
            return false;
        Block other = (Block) obj;
        if (other.getBlockType() == null ^ this.getBlockType() == null)
            return false;
        if (other.getBlockType() != null && other.getBlockType().equals(this.getBlockType()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getRowIndex() == null ^ this.getRowIndex() == null)
            return false;
        if (other.getRowIndex() != null && other.getRowIndex().equals(this.getRowIndex()) == false)
            return false;
        if (other.getColumnIndex() == null ^ this.getColumnIndex() == null)
            return false;
        if (other.getColumnIndex() != null && other.getColumnIndex().equals(this.getColumnIndex()) == false)
            return false;
        if (other.getRowSpan() == null ^ this.getRowSpan() == null)
            return false;
        if (other.getRowSpan() != null && other.getRowSpan().equals(this.getRowSpan()) == false)
            return false;
        if (other.getColumnSpan() == null ^ this.getColumnSpan() == null)
            return false;
        if (other.getColumnSpan() != null && other.getColumnSpan().equals(this.getColumnSpan()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRelationships() == null ^ this.getRelationships() == null)
            return false;
        if (other.getRelationships() != null && other.getRelationships().equals(this.getRelationships()) == false)
            return false;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        if (other.getSelectionStatus() == null ^ this.getSelectionStatus() == null)
            return false;
        if (other.getSelectionStatus() != null && other.getSelectionStatus().equals(this.getSelectionStatus()) == false)
            return false;
        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockType() == null) ? 0 : getBlockType().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getRowIndex() == null) ? 0 : getRowIndex().hashCode());
        hashCode = prime * hashCode + ((getColumnIndex() == null) ? 0 : getColumnIndex().hashCode());
        hashCode = prime * hashCode + ((getRowSpan() == null) ? 0 : getRowSpan().hashCode());
        hashCode = prime * hashCode + ((getColumnSpan() == null) ? 0 : getColumnSpan().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRelationships() == null) ? 0 : getRelationships().hashCode());
        hashCode = prime * hashCode + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getSelectionStatus() == null) ? 0 : getSelectionStatus().hashCode());
        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        return hashCode;
    }

    @Override
    public Block clone() {
        try {
            return (Block) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.BlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
