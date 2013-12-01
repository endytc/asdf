ALTER TABLE  `poin_kriteria_warga` DROP FOREIGN KEY  `poin_kriteria_warga_ibfk_1` ;

ALTER TABLE  `poin_kriteria_warga` ADD CONSTRAINT  `poin_kriteria_warga_ibfk_1` FOREIGN KEY (  `NKK` ) REFERENCES `db_jamkesda`.`warga` (
`NKK`
) ON DELETE CASCADE ON UPDATE CASCADE ;

ALTER TABLE  `subkriteria` DROP FOREIGN KEY  `subkriteria_ibfk_1` ;

ALTER TABLE  `subkriteria` ADD CONSTRAINT  `subkriteria_ibfk_1` FOREIGN KEY (  `ID_KRITERIA` ) REFERENCES `db_jamkesda`.`kriteria` (
`ID_KRITERIA`
) ON DELETE CASCADE ON UPDATE CASCADE ;