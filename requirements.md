# Requirements Document

## Introduction

Aarogya Mitra is an AI-assisted patient intake and information-structuring system designed to solve the critical problem of unstructured patient information sharing in Indian hospitals during emergencies. The system converts messy, multilingual, and emotional patient inputs into structured clinical summaries, helping doctors save time and reduce cognitive overload while maintaining human-in-the-loop decision making.

## Glossary

- **Patient_Mitra**: Input-side application used by patient attendants or hospital staff
- **Aarogya_Mitra**: Doctor-side application displaying structured patient summaries
- **Clinical_Summary**: Structured patient information extracted from raw inputs
- **Medical_Entity**: Symptoms, duration, medical history, medications, or other clinical data points
- **Confidence_Tag**: AI-assigned certainty level (high/medium/low) for extracted information
- **Risk_Indicator**: Non-diagnostic flags highlighting potential concerns for doctor attention
- **Data_Session**: Shared backend session linking Patient_Mitra and Aarogya_Mitra data
- **Attendant**: Family member, friend, or hospital staff member providing patient information
- **Raw_Input**: Unstructured text or voice input containing patient information
- **Timeline**: Chronological sequence of symptoms and medical events

## Requirements

### Requirement 1: Patient Information Collection

**User Story:** As an attendant or hospital staff member, I want to provide patient information through voice or text, so that doctors can receive structured clinical data quickly during emergencies.

#### Acceptance Criteria

1. WHEN an attendant provides voice input, THE Patient_Mitra SHALL convert speech to text and store the raw input
2. WHEN an attendant provides text input, THE Patient_Mitra SHALL accept and store the input directly
3. WHEN input contains multiple languages, THE Patient_Mitra SHALL process and extract medical information regardless of language mixing
4. WHEN emotional or distressed language is used, THE Patient_Mitra SHALL extract factual medical information while filtering emotional content
5. WHERE previous prescriptions or reports are available, THE Patient_Mitra SHALL allow document upload and extract relevant medical history

### Requirement 2: Medical Information Extraction

**User Story:** As a system, I want to extract structured medical entities from unstructured input, so that doctors receive organized clinical information.

#### Acceptance Criteria

1. WHEN processing raw input, THE System SHALL identify and extract symptoms, duration, medical history, and medications
2. WHEN extracting medical entities, THE System SHALL assign confidence tags (high/medium/low) to each piece of information
3. WHEN multiple symptoms are mentioned, THE System SHALL create a chronological timeline of symptom onset and progression
4. WHEN contradictory information is detected, THE System SHALL flag inconsistencies for doctor review
5. WHEN critical information is missing, THE System SHALL generate alerts highlighting gaps in patient data

### Requirement 3: Clinical Summary Generation

**User Story:** As a doctor, I want to receive structured patient summaries, so that I can quickly understand patient conditions without processing unstructured information.

#### Acceptance Criteria

1. THE Aarogya_Mitra SHALL display extracted medical entities in a structured clinical format
2. WHEN presenting symptoms, THE Aarogya_Mitra SHALL show symptom timelines with onset dates and progression
3. WHEN displaying extracted information, THE Aarogya_Mitra SHALL show confidence levels for each data point
4. WHEN contradictions exist, THE Aarogya_Mitra SHALL highlight conflicting information with clear visual indicators
5. WHEN critical information is missing, THE Aarogya_Mitra SHALL display prominent alerts about data gaps

### Requirement 4: Risk Indication (Non-Diagnostic)

**User Story:** As a doctor, I want to see risk indicators based on patient information, so that I can prioritize attention without receiving diagnostic suggestions.

#### Acceptance Criteria

1. WHEN patient information suggests potential urgency, THE System SHALL display risk indicators without making diagnostic claims
2. WHEN generating risk indicators, THE System SHALL base flags only on symptom severity, duration, and patient history patterns
3. THE System SHALL NOT suggest specific diseases, treatments, or diagnostic procedures
4. WHEN displaying risk indicators, THE System SHALL clearly label them as non-diagnostic flags for doctor consideration
5. THE System SHALL allow doctors to acknowledge or dismiss risk indicators without affecting patient data

### Requirement 5: Document Understanding and Explanation

**User Story:** As an attendant, I want to understand insurance documents and medical reports, so that I can provide complete information to healthcare providers.

#### Acceptance Criteria

1. WHEN insurance documents are uploaded, THE Patient_Mitra SHALL extract coverage information and explain benefits in plain language
2. WHEN medical reports are uploaded, THE Patient_Mitra SHALL identify key medical findings and explain them in understandable terms
3. THE System SHALL NOT provide medical advice or interpret diagnostic results beyond factual explanation
4. WHEN explaining documents, THE System SHALL maintain accuracy while using simple, non-technical language
5. WHERE document text is unclear or incomplete, THE System SHALL indicate uncertainty and request clarification

### Requirement 6: Session Management and Data Sharing

**User Story:** As a healthcare system, I want Patient_Mitra and Aarogya_Mitra to share data seamlessly, so that information flows efficiently from intake to doctor review.

#### Acceptance Criteria

1. WHEN a patient session is created in Patient_Mitra, THE System SHALL generate a unique session identifier
2. WHEN data is entered in Patient_Mitra, THE System SHALL update the shared data session in real-time
3. WHEN Aarogya_Mitra accesses a session, THE System SHALL display the most current patient information
4. THE System SHALL maintain data consistency between Patient_Mitra and Aarogya_Mitra applications
5. WHEN a session is completed, THE System SHALL preserve data for doctor access while maintaining patient privacy

### Requirement 7: Multilingual Processing

**User Story:** As an attendant speaking multiple languages, I want to provide information in my preferred language mix, so that language barriers don't prevent accurate medical communication.

#### Acceptance Criteria

1. WHEN input contains Hindi, English, or regional Indian languages, THE System SHALL process and extract medical information
2. WHEN language switching occurs within a single input, THE System SHALL maintain context and extract complete medical entities
3. WHEN medical terms are used in local languages, THE System SHALL map them to standard medical terminology
4. THE System SHALL preserve original language context while generating English clinical summaries for doctors
5. WHERE language ambiguity exists, THE System SHALL request clarification rather than making assumptions

### Requirement 8: Hospital Integration Support

**User Story:** As a hospital administrator, I want basic hospital information integration, so that patients can access relevant facility information.

#### Acceptance Criteria

1. WHEN patients need hospital information, THE System SHALL provide basic hospital listings in the local area
2. THE System SHALL display hospital contact information, basic services, and location details
3. THE System SHALL NOT provide hospital ratings, reviews, or comparative recommendations
4. THE System SHALL focus on factual hospital information without commercial bias
5. WHERE hospital data is unavailable, THE System SHALL indicate information limitations clearly

### Requirement 9: AI Safety and Limitations

**User Story:** As a healthcare system, I want AI assistance to remain strictly supportive, so that human medical judgment is never compromised or replaced.

#### Acceptance Criteria

1. THE System SHALL NOT generate disease predictions, diagnostic suggestions, or treatment recommendations
2. WHEN processing medical information, THE System SHALL limit AI functions to extraction, structuring, and explanation only
3. THE System SHALL display clear disclaimers that all medical decisions must be made by qualified healthcare professionals
4. WHEN uncertainty exists in extracted information, THE System SHALL indicate low confidence rather than making assumptions
5. THE System SHALL maintain human-in-the-loop architecture where doctors retain full decision-making authority

### Requirement 10: Emergency-Optimized Interface

**User Story:** As a doctor in an emergency situation, I want quick access to essential patient information, so that I can make rapid clinical assessments.

#### Acceptance Criteria

1. WHEN displaying patient information, THE Aarogya_Mitra SHALL prioritize critical symptoms and recent changes
2. THE System SHALL present information in scannable format optimized for quick reading under time pressure
3. WHEN multiple patients are in queue, THE System SHALL allow rapid switching between patient summaries
4. THE System SHALL highlight time-sensitive information with appropriate visual emphasis
5. THE System SHALL minimize cognitive load by presenting only essential information in the primary view