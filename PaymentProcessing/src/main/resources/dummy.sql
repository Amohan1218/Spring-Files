-- Create the Agents table
DROP TABLE Agents;
CREATE TABLE Agents (
    agent_id SERIAL PRIMARY KEY,
    agent_name VARCHAR(50)
);

DROP TABLE Users;
CREATE TABLE Users (
    user_id SERIAL PRIMARY KEY,
    user_name VARCHAR(30),
    user_cdate DATE,
    user_pwd VARCHAR(100),
    user_type CHAR(4) CHECK (user_type IN ('ADMN', 'CUST')),
    user_status CHAR(2)
);

DROP TABLE Customers;
CREATE TABLE Customers (
    cust_id SERIAL PRIMARY KEY,
    cust_fname VARCHAR(50),
    cust_lname VARCHAR(50),
    cust_dob DATE,
    cust_address VARCHAR(255),
    cust_gender CHAR(1),
    cust_cdate DATE,
    cust_aadhar INT,
    cust_status CHAR(2),
    cust_luudate DATE,
    cust_luuser INT
);
SELECT * FROM Customers;

CREATE TABLE InsurancePackages (
    insp_id INT PRIMARY KEY,
    insp_title VARCHAR(60),
    insp_desc VARCHAR(255),
    insp_status VARCHAR(10),
    insp_range_start NUMERIC,
    insp_range_end NUMERIC,
    insp_agelimit_start INT,
    insp_agelimit_end INT
);
INSERT INTO InsurancePackages (insp_id, insp_title, insp_desc, insp_status, insp_range_start, insp_range_end, insp_agelimit_start, insp_agelimit_end) VALUES
(1, 'Basic Health Insurance', 'Covers essential medical expenses', 'Active', 1000, 10000, 18, 65),
(2, 'Comprehensive Auto Insurance', 'Provides full coverage for your vehicle', 'Active', 5000, 50000, 25, 70),
(3, 'Term Life Insurance', 'Coverage for a fixed term with payout on death', 'Active', 10000, 100000, 18, 75),
(4, 'Travel Insurance', 'Protection for your trips and vacations', 'Active', 500, 5000, 1, 80),
(5, 'Home Insurance', 'Protects your home and belongings', 'Active', 20000, 200000, 25, 80),
(6, 'Pet Insurance', 'Covers veterinary expenses for your pets', 'Active', 500, 5000, 1, 15),
(7, 'Business Liability Insurance', 'Protection for business owners', 'Active', 10000, 100000, 25, 65),
(8, 'Disability Insurance', 'Income replacement due to disability', 'Active', 1000, 10000, 18, 65),
(9, 'Critical Illness Insurance', 'Coverage for major illnesses', 'Active', 5000, 50000, 18, 70),
(10, 'Dental Insurance', 'Covers dental procedures and check-ups', 'Active', 500, 5000, 1, 75);
SELECT * FROM InsurancePackages;

DROP TABLE Diseases CASCADE
CREATE TABLE Diseases (
    disc_id SERIAL PRIMARY KEY,
    disc_name VARCHAR(100),
    disc_icdcode VARCHAR(10),
    disc_desc VARCHAR(255),
    disc_status VARCHAR(10)
);
INSERT INTO Diseases (disc_name, disc_icdcode, disc_desc, disc_status) VALUES
('Influenza', 'J10', 'Respiratory infection caused by influenza viruses', 'Active'),
('Hypertension', 'I10', 'High blood pressure', 'Active'),
('Type 2 Diabetes', 'E11', 'Metabolic disorder resulting in high blood sugar', 'Active'),
('Asthma', 'J45', 'Chronic respiratory disease causing breathing difficulties', 'Active'),
('Osteoarthritis', 'M15', 'Degenerative joint disease', 'Active'),
('Cancer', 'C50', 'Malignant tumor', 'Active'),
('Heart Disease', 'I25', 'Various conditions affecting the heart', 'Active'),
('Migraine', 'G43', 'Recurrent headaches', 'Active'),
('Chronic Kidney Disease', 'N18', 'Progressive kidney damage', 'Active'),
('Alzheimer''s Disease', 'G30', 'Neurodegenerative disease causing memory loss', 'Active');
SELECT * FROM Diseases;

DROP TABLE NetworkHospitals;
CREATE TABLE NetworkHospitals (
    hosp_id INT PRIMARY KEY,
    hosp_title VARCHAR(70),
    hosp_location VARCHAR(50),
    hosp_address VARCHAR(100),
    hosp_contact_number VARCHAR(10),
    hosp_pincode INT,
    hosp_luudate DATE,
    hosp_luuser INT
);
INSERT INTO NetworkHospitals (hosp_id, hosp_title, hosp_location, hosp_address, hosp_contact_number, hosp_pincode, hosp_luudate, hosp_luuser) VALUES
(1, 'City Hospital', 'City Center', '123 Main St', '1234567890', 12345, '2023-09-23', 1),
(2, 'Rural Health Clinic', 'Rural Village', '456 Elm St', '2345678901', 54321, '2023-09-23', 2),
(3, 'Metro General Hospital', 'Downtown', '789 Oak St', '3456789012', 67890, '2023-09-23', 3),
(4, 'Coastal Medical Center', 'Coastal City', '987 Pine St', '4567890123', 45678, '2023-09-23', 1),
(5, 'Mountain View Hospital', 'Mountain Town', '654 Birch St', '5678901234', 98765, '2023-09-23', 2),
(6, 'Sunrise Medical Center', 'Suburban Area', '321 Cedar St', '6789012345', 87654, '2023-09-23', 3),
(7, 'Golden State Hospital', 'Downtown', '135 Redwood St', '7890123456', 10987, '2023-09-23', 1),
(8, 'Valley Community Clinic', 'Valley Town', '246 Maple St', '8901234567', 32109, '2023-09-23', 2),
(9, 'Northern Regional Hospital', 'Northern City', '753 Willow St', '9012345678', 54321, '2023-09-23', 3),
(10, 'Sunnyvale Medical Center', 'Suburban Area', '852 Walnut St', '0123456789', 43210, '2023-09-23', 1),
(11, 'Bayside Health Center', 'Coastal Town', '369 Spruce St', '1234509876', 56789, '2023-09-23', 2),
(12, 'Capital City Hospital', 'City Center', '147 Elm St', '2345678901', 98765, '2023-09-23', 3),
(13, 'Hillside General Hospital', 'Hillside Area', '963 Pine St', '3456789012', 10987, '2023-09-23', 1),
(14, 'Lakeview Medical Center', 'Lakeside Town', '753 Birch St', '4567890123', 54321, '2023-09-23', 2),
(15, 'Countryside Health Clinic', 'Countryside', '258 Oak St', '5678901234', 87654, '2023-09-23', 3);
SELECT * FROM NetworkHospitals;

CREATE TABLE InsurancePackageCoveredDiseases (
    insp_id INT,
    disc_id INT,
    PRIMARY KEY (insp_id, disc_id),
    FOREIGN KEY (insp_id) REFERENCES InsurancePackages(insp_id),
    FOREIGN KEY (disc_id) REFERENCES Diseases(disc_id)
);

-- Create the InsurancePolicies table
DROP TABLE InsurancePolicies CASCADE;
DELETE FROM InsurancePolicies;
CREATE TABLE InsurancePolicies (
    iplc_id SERIAL PRIMARY KEY,
    iplc_cust_id INT,
    iplc_cdate DATE,
    iplc_sum_assured NUMERIC,
    iplc_applicable_date DATE,
    iplc_insp_id INT,
    iplc_yrly_prem_amount NUMERIC,
    iplc_expdate DATE,
    iplc_agnt_id INT,
	iplc_mode int,
	iplc_status varchar(20)
    --FOREIGN KEY (iplc_insp_id) REFERENCES InsurancePackages(insp_id),
    --FOREIGN KEY (iplc_agnt_id) REFERENCES Agents(agent_id)
);
-- Insert row 1
INSERT INTO InsurancePolicies (iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id, iplc_mode, iplc_status)
VALUES (1, '2023-09-23', 10000.00, '2023-09-23', 1, 1200.00, '2024-09-23', 1, 1, 'Pending');

-- Insert row 2
INSERT INTO InsurancePolicies (iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id, iplc_mode, iplc_status)
VALUES (1, '2023-09-24', 15000.00, '2023-09-24', 2, 1800.00, '2024-09-24', 2, 4, 'Pending');

-- Insert row 3
INSERT INTO InsurancePolicies (iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id, iplc_mode, iplc_status)
VALUES (2, '2023-09-25', 20000.00, '2023-09-25', 3, 2400.00, '2024-09-25', 3, 6, 'Processed');

-- Insert row 4
INSERT INTO InsurancePolicies (iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id, iplc_mode, iplc_status)
VALUES (2, '2023-09-26', 12000.00, '2023-09-26', 1, 1440.00, '2024-09-26', 2, 2, 'Pending');

-- Insert row 5
INSERT INTO InsurancePolicies (iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id, iplc_mode, iplc_status)
VALUES (2, '2023-09-27', 18000.00, '2023-09-27', 2, 2160.00, '2024-09-27', 3, 1, 'Processed');

-- Insert row 6
INSERT INTO InsurancePolicies (iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id, iplc_mode, iplc_status)
VALUES (6, '2023-09-28', 9000.00, '2023-09-28', 3, 1080.00, '2024-09-28', 1, 4, 'Pending');

-- Insert row 7
INSERT INTO InsurancePolicies (iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id, iplc_mode, iplc_status)
VALUES (7, '2023-09-29', 14000.00, '2023-09-29', 1, 1680.00, '2024-09-29', 2, 4, 'Processed');

-- Insert row 8
INSERT INTO InsurancePolicies (iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id, iplc_mode, iplc_status)
VALUES (8, '2023-09-30', 11000.00, '2023-09-30', 2, 1320.00, '2024-09-30', 3, 6, 'Pending');

-- Insert row 9
INSERT INTO InsurancePolicies (iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id, iplc_mode, iplc_status)
VALUES (9, '2023-10-01', 16000.00, '2023-10-01', 3, 1920.00, '2024-10-01', 1, 6, 'Pending');

-- Insert row 10
INSERT INTO InsurancePolicies (iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id, iplc_mode, iplc_status)
VALUES (10, '2023-10-02', 8000.00, '2023-10-02', 1, 960.00, '2024-10-02', 2, 2, 'Pending');

SELECT * FROM InsurancePolicies;

CREATE TABLE InsurancePolicySchedule (
    iplc_id INT,
    iplc_sindex SMALLINT,
    iplc_date DATE,
    iplc_premium NUMERIC,
    iplc_paid_date DATE,
    PRIMARY KEY (iplc_id, iplc_sindex),
    FOREIGN KEY (iplc_id) REFERENCES InsurancePolicies(iplc_id)
);

CREATE TABLE InsurancePolicyPayments (
    inpp_id INT PRIMARY KEY,
    inpp_iplc_id INT,
    inpp_trans_id VARCHAR(50),
    inpp_amount NUMERIC,
    inpp_paymode CHAR(4),
    FOREIGN KEY (inpp_iplc_id) REFERENCES InsurancePolicies(iplc_id)
);




CREATE TABLE Payments (
  PaymentID VARCHAR(10),
  CustomerID VARCHAR(10),
  ClaimID VARCHAR(10),
  HospitalID VARCHAR(10),
  PaymentAmount INT,
  PaymentDate DATE
);

INSERT INTO Payments (PaymentID, CustomerID, ClaimID, HospitalID, PaymentAmount, PaymentDate)
VALUES
  ('P1', 'C1', 'CL1', 'H1', 1000, '2023-09-01'),
  ('P2', 'C2', 'CL2', 'H2', 1500, '2023-09-02'),
  ('P3', 'C3', 'CL3', 'H3', 2000, '2023-09-03'),
  ('P4', 'C4', 'CL4', 'H4', 1200, '2023-09-04'),
  ('P5', 'C5', 'CL5', 'H5', 1800, '2023-09-05'),
  ('P6', 'C6', 'CL6', 'H6', 900, '2023-09-06'),
  ('P7', 'C7', 'CL7', 'H7', 2200, '2023-09-07'),
  ('P8', 'C8', 'CL8', 'H8', 1300, '2023-09-08'),
  ('P9', 'C9', 'CL9', 'H9', 1700, '2023-09-09'),
  ('P10', 'C10', 'CL10', 'H10', 1100, '2023-09-10');

SELECT * FROM Payments;



DROP TABLE Transactionss;
CREATE TABLE Transactionss (
    tran_id VARCHAR(20),
    tran_date date,
    claim_id int
);
DELETE FROM Transactionss;
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (1, '2023-09-01', 101);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (2, '2023-09-02', 102);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (3, '2023-09-03', 103);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (4, '2023-09-04', 104);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (5, '2023-09-05', 105);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (6, '2023-09-06', 106);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (7, '2023-09-07', 107);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (8, '2023-09-08', 108);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (9, '2023-09-09', 109);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (10, '2023-09-10', 110);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (11, '2023-09-11', 111);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (12, '2023-09-12', 112);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (13, '2023-09-13', 113);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (14, '2023-09-14', 114);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (15, '2023-09-15', 115);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (16, '2023-09-16', 116);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (17, '2023-09-17', 117);
INSERT INTO Transactionss (tran_id, tran_date, claim_id) VALUES (18, '2023-09-18', 118);

SELECT * FROM Transactionss;


DROP TABLE claims
CREATE TABLE claims (
    clam_id int PRIMARY KEY,
    clam_source character(4),
    clam_type character(4),
    clam_date date,
    clam_amount_requested numeric,
    clam_iplc_id int,
    clam_processed_amount numeric(8,2),
    clam_processed_Date date,
    clam_processed_by int,
    clam_remarks varchar(1000),
    clam_status character(4),
	pay_status VARCHAR(12)
);
DELETE FROM claims
INSERT INTO claims (clam_id, clam_source, clam_type, clam_date, clam_amount_requested, clam_iplc_id, clam_processed_amount, clam_processed_Date, clam_processed_by, clam_remarks, clam_status,pay_status)
VALUES
    (101, 'INDV', 'DRCT', '2023-09-01', 100000.00, 101, 90000.50, '2023-09-02', 201, 'Approved', 'APPR','Pending...'),
    (102, 'HSPT', 'REIM', '2023-09-03', 150000.75, 102, 140000.25, '2023-09-04', 202, 'Rejected', 'REJT','Pending...'),
    (103, 'INDV', 'DRCT', '2023-09-05', 80000.50, 103, 78000.25, '2023-09-06', 203, 'Under Process', 'UPRO','Pending...'),
    (104, 'HSPT', 'REIM', '2023-09-07', 120000.25, 104, 110000.75, '2023-09-08', 204, 'Rejected', 'REJT','Pending...'),
    (105, 'INDV', 'DRCT', '2023-09-09', 95000.75, 105, 92000.25, '2023-09-10', 205, 'Approved', 'APPR','Pending...'),
    (106, 'HSPT', 'REIM', '2023-09-11', 110000.50, 106, 105000.25, '2023-09-12', 206, 'Rejected', 'REJT','Pending...'),
    (107, 'INDV', 'DRCT', '2023-09-13', 75000.25, 107, 72000.75, '2023-09-14', 207, 'Approved', 'APPR','Pending...'),
    (108, 'HSPT', 'REIM', '2023-09-15', 130000.75, 108, 125000.25, '2023-09-16', 208, 'Under Process', 'UPRO','Pending...'),
    (109, 'INDV', 'DRCT', '2023-09-17', 85000.50, 109, 82000.25, '2023-09-18', 209, 'Approved', 'APPR','Pending...'),
    (110, 'HSPT', 'REIM', '2023-09-19', 160000.25, 110, 150000.75, '2023-09-20', 210, 'Rejected', 'REJT','Pending...'),
    (111, 'INDV', 'DRCT', '2023-09-21', 90000.75, 111, 87000.25, '2023-09-22', 211, 'Approved', 'APPR','Pending...'),
    (112, 'HSPT', 'REIM', '2023-09-23', 140000.50, 112, 135000.25, '2023-09-24', 212, 'Rejected', 'REJT','Pending...'),
    (113, 'INDV', 'DRCT', '2023-09-25', 78000.25, 113, 75000.75, '2023-09-26', 213, 'Approved', 'APPR','Pending...'),
    (114, 'HSPT', 'REIM', '2023-09-27', 125000.75, 114, 120000.25, '2023-09-28', 214, 'Rejected', 'REJT','Pending...'),
    (115, 'INDV', 'DRCT', '2023-09-29', 110000.50, 115, 105000.25, '2023-09-30', 215, 'Approved', 'APPR','Pending...'),
    (116, 'INDV', 'DRCT', '2023-10-01', 92000.75, 116, 90000.25, '2023-10-02', 216, 'Under Process', 'UPRO','Pending...'),
    (117, 'HSPT', 'REIM', '2023-10-03', 115000.50, 117, 112000.25, '2023-10-04', 217, 'Under Process', 'UPRO','Pending...'),
    (118, 'INDV', 'DRCT', '2023-10-05', 79000.25, 118, 77000.75, '2023-10-06', 218,'Approved', 'APPR','Pending...'),
    (119, 'HSPT', 'REIM', '2023-10-07', 130000.75, 119, 126000.25, '2023-10-08', 219, 'Under Process', 'UPRO','Pending...'),
    (120, 'INDV', 'DRCT', '2023-10-09', 88000.50, 120, 86000.25, '2023-10-10', 220, 'Rejected', 'REJT','Pending...');

SELECT * FROM claims;

DROP TABLE Settlements
CREATE TABLE Settlements (
    stmt_id serial PRIMARY KEY,
    tran_id varchar(30),
    payment_Processed_date date,
    claim_id int,
    tran_amnt double precision
);

SELECT * FROM Settlements