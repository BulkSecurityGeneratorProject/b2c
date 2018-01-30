package io.github.jhipster.application.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A Downloads.
 */
@Entity
@Table(name = "downloads")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Downloads implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exam")
    private String exam;

    @Column(name = "image")
    private String image;

    @Column(name = "jhi_date")
    private Instant date;

    @ManyToOne
    private SchoolClass schoolClass;

    @ManyToOne
    private Section section;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExam() {
        return exam;
    }

    public Downloads exam(String exam) {
        this.exam = exam;
        return this;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getImage() {
        return image;
    }

    public Downloads image(String image) {
        this.image = image;
        return this;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Instant getDate() {
        return date;
    }

    public Downloads date(Instant date) {
        this.date = date;
        return this;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public Downloads schoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
        return this;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Section getSection() {
        return section;
    }

    public Downloads section(Section section) {
        this.section = section;
        return this;
    }

    public void setSection(Section section) {
        this.section = section;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Downloads downloads = (Downloads) o;
        if (downloads.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), downloads.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Downloads{" +
            "id=" + getId() +
            ", exam='" + getExam() + "'" +
            ", image='" + getImage() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }
}
